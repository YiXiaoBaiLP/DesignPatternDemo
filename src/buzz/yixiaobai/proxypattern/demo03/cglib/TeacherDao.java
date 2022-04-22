package buzz.yixiaobai.proxypattern.demo03.cglib;

/**
 * 代理模式-Cglib被代理类
 * @author yixiaobai
 * @create 2022/04/22 下午4:53
 */
public class TeacherDao {

    public void teach(){
        System.out.println("老师授课中，我是Cglib代理，不需要实现接口！");
    }
}
