package buzz.yixiaobai.proxypattern.demo03.cglib;

/**
 * 代理模式-Cglib代理客户端
 * @author yixiaobai
 * @create 2022/04/22 下午5:02
 */
public class Client {
    public static void main(String[] args){
        // 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 获取到代理对象，并且将对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        // 执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
