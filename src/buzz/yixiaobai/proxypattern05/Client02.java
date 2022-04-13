package buzz.yixiaobai.proxypattern05;

/**
 * 场景类
 * @author yixiaobai
 * @create 2022/04/13 下午4:39
 */
public class Client02 {
    public static void main(String[] args){
        // 定义一个主题
        Subject subject = new ResalSubject();
        // 定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        // 代理的行为
        proxy.doSomething("Finsh");
    }
}
