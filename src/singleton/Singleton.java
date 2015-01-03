package singleton;

/**
 * @Author: wangzhenqing
 * @Date: 2015年01月03日23:00:01
 * @Description: 单例模式IoDH
 */
public class Singleton {
    private Singleton(){

    }

    private static class HolderClass{
        private final static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.singleton;
    }

    public static void main(String[] args){
        Singleton s1, s2;
        s1 = getInstance();
        s2 = getInstance();
        System.out.println(s1 == s2);
    }
}
