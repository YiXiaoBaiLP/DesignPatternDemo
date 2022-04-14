package buzz.yixiaobai.prototypepattern03;

/**
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
        因为：在Java中Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用就叫做浅拷贝，还是指向原生对象的内部元素，这种拷贝就叫做浅拷贝。
         */
        System.out.println(thing.getValue());
    }
}
