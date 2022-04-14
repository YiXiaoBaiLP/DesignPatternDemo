package buzz.yixiaobai.prototypepattern04;

/**
 * 深拷贝客户端
 * @author yixiaobai
 * @create 2022/04/14 下午5:02
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
       Thing thing = new Thing();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        /*
        正常情况下应该只有一个“张三”
         */
        System.out.println(thing.getValue());
        System.out.println(cloneThing.getValue());
    }
}
