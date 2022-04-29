package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 展现表示接口
 * @author yixiaobai
 * @create 2022/04/30 上午12:38
 */
public interface IShowVisitor extends IVisitor{

    /**
     * 展示报表
     */
    void report();
}
