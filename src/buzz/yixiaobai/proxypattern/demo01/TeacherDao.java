package buzz.yixiaobai.proxypattern.demo01;

/**
 * 静态代理模式-实现类（被代理对象）
 * @author yixiaobai
 * @create 2022/04/22 下午2:34
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师正在上课！");
    }
}
