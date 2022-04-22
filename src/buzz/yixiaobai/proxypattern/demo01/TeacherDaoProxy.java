package buzz.yixiaobai.proxypattern.demo01;

/**
 * 静态代理-代理对象
 * @author yixiaobai
 * @create 2022/04/22 下午2:35
 */
public class TeacherDaoProxy implements ITeacherDao{
    // 目标对象，通过接口来聚合
    private ITeacherDao target;
    // 构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始 完成某些操作。。。");
        target.teach();
        System.out.println("代理结束。。。");
    }


}
