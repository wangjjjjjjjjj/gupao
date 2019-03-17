package study.pattern.proxy.jdkproxyshouxie;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader, Class<?>[] interfaces, MyInvocationHandler h){
        try {
//        JDK Proxy 生成对象的步骤如下：（字节码重组）
//        1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
//        2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接
//        口。

            String src = generateSrc(interfaces);
//        3、动态生成Java 代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体
//        现）。
            String filePath = MyProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File file = new File(filePath+"$proxy.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();
//        4、编译新生成的Java 代码.class。

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
//        5、再重新加载到JVM 中运行。
            Class proxyClass = classLoader.findClass("$proxy");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    public static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package study.pattern.proxy.jdkproxyshouxie;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("import study.pattern.proxy.jdkproxy.Person;"+ln);

        sb.append("public final class $proxy implements "+interfaces[0].getName()+"{"+ln);
            sb.append("MyInvocationHandler h;"+ln);
            sb.append("public $proxy(MyInvocationHandler myInvocationHandler){"+ln);
                sb.append("this.h = myInvocationHandler;"+ln);
            sb.append("}"+ln);

            for(Method method : interfaces[0].getMethods()){
                sb.append("public "+method.getReturnType().getName()+" "+ method.getName()+"(){"+ln);
                    sb.append("try{"+ln);
                        sb.append("Method m  = "+interfaces[0].getName()+".class.getMethod(\""+method.getName()+"\",new Class[]{});"+ln);
                        sb.append("this.h.invoke(this,m,null);"+ln);
                    sb.append("}catch(Throwable e){"+ln);
                        sb.append("e.printStackTrace();"+ln);
                    sb.append("}"+ln);
                sb.append("}");
            }
        sb.append("}");

        return sb.toString();
    }
}
