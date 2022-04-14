package buzz.yixiaobai.prototypepattern05;

/**
 * 深拷贝（基于二进制流实现）客户端
 * @author yixiaobai
 * @create 2022/04/14 下午6:03
 */
public class Client {
    public static void main(String[] args){
        // 定义一个对象
        Thing thing = new Thing();
        thing.setList("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setList("李四");
        System.out.println(thing.getList());
        System.out.println(cloneThing.getList());

    }
}
