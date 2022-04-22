package buzz.yixiaobai.proxypattern.demo02;

/**
 * 动态代理-被代理对象
 * @author yixiaobai
 * @create 2022/04/22 下午3:04
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师正在授课中。。。");
    }

    @Override
    public String hello(String name) {
        System.out.println("Hello " + name);
        return "Hello " + name;
    }
}
