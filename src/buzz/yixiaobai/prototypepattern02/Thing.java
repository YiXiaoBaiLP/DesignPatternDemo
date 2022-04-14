package buzz.yixiaobai.prototypepattern02;

/**
 * 简单的可拷贝对象
 *  原型模式的构造函数不会别执行
 * @author yixiaobai
 * @create 2022/04/14 下午4:30
 */
public class Thing implements Cloneable{

    public Thing(){
        System.out.println("构造函数执行了。。。");
    }
    /*
    原型模式：实现Cloneable接口然后重写clone()方法，不会执行构造函数方法
     */
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
