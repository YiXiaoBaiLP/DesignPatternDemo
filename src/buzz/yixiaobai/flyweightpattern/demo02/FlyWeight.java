package buzz.yixiaobai.flyweightpattern.demo02;

/**
 * 享元模式在JDK源码中的体验
 * @author yixiaobai
 * @create 2022/04/21 下午4:30
 */
public class FlyWeight {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y)); // 大小，true
        System.out.println(x == y); // false
        System.out.println(x == z); // true
        System.out.println(w == x); // false
        System.out.println(w == y); // false

        // 如果Integer.valueOf(x) x在 -128 <---> 127 之间，就是使用的享元模式返回，否则返回新的实例
        // 1、在valueof方法中，先判断值是否在IntegerCache中，如果不在，就创建新的Integer(new)，否则就直接从缓存池中返回
        // 2、valueOf()方法，就使用到了享元模式
        // 3、如果使用valueOf()方法得到一个Intger实例，范围在 -128 <----> 127之间，执行速度比new快
        Integer x2 = Integer.valueOf(128);
        Integer z2 = Integer.valueOf(128);
        System.out.println(x2 == z2); // false
    }
}
