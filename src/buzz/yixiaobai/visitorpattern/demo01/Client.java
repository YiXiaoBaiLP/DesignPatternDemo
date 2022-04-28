package buzz.yixiaobai.visitorpattern.demo01;

/**
 * 访问者模式-客户端
 * @author yixiaobai
 * @create 2022/04/27 下午8:02
 */
public class Client {

    public static void main(String[] args){
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        // 成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===========================");
        // 失败
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
