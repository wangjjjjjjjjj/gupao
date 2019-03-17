package study.pattern.proxy.staticproxy;

public class DynamicDataSourceEntry {

    private final static String DEFLAUT_DATASOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    public static void clear(){
        local.remove();
    }

    public static String get(){
        return local.get();
    }

    public static void set(String resource){
        local.set("DB_"+resource);
    }

    public static void restore(){
        local.set(DEFLAUT_DATASOURCE);
    }
}
