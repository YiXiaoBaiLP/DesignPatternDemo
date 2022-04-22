package buzz.yixiaobai.proxypattern.demo02;

/**
 * 动态代理-客户端
 * @author yixiaobai
 * @create 2022/04/22 下午3:34
 */
public class Client {
    public static void main(String[] args){
        // 创建目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标对象，创建代理对象，可以转成ITeacherDao
        ITeacherDao teacherDao = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        // 通过代理对象，调用目标对象的方法
        teacherDao.teach();
        teacherDao.hello("Tom");
        System.out.println("teacherDao：" + teacherDao);
        //teacherDao.Class：class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("teacherDao.Class：" + teacherDao.getClass());
    }
}
