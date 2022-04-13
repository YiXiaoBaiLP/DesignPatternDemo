package buzz.yixiaobai.proxypattern05;

/**
 * 抽象主题
 * @author yixiaobai
 * @create 2022/04/13 下午3:46
 */
public interface Subject {
    // 业务操作(可以有多个逻辑处理方法）
    void doSomething(String str);
}
