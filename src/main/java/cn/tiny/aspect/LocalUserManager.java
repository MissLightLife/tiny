package cn.tiny.aspect;



/**
 * @author tiny
 * date 2018/12/29 10:55
 */
public class LocalUserManager {
    private  static final ThreadLocal<String> localUserManeger=new ThreadLocal<>();

    public static String get(){
       return localUserManeger.get()==null ?"unknow":localUserManeger.get();
    }
    public static void set(String name){
        localUserManeger.set(name);
    }
}
