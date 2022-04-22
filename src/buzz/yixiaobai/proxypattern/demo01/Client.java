package buzz.yixiaobai.proxypattern.demo01;

/**
 * 静态代理模式-客户端
 * @author yixiaobai
 * @create 2022/04/22 下午2:39
 */
public class Client {
    public static void main(String[] args){
        // 目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象,同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用被代理对象的方法
        // 即：执行的是代理对象的方法，代理对象再去调用被代理对象的方法
        teacherDaoProxy.teach();
    }
}
