package buzz.yixiaobai.richterscale;

/**
 * 里氏替换原则
 * @author yixiaobai
 * @create 2022/04/19 下午5:45
 */
public class demo {
    public static void main(String[] args) {
        A a = new A();
        int sum = a.fun1(11, 3);
        System.out.println(sum);
        B b = new B();
        int sumB = b.fun3(11, 3);
        System.out.println(sumB);
    }
}

class Base{
    // 返回a-b的差
    public int fun1(int a, int b){
        return a-b;
    }
}

class A extends Base {

}

class B extends Base {
    private A a = new A();
    // 返回 a+b的和
    public int fun2(int a, int b){
        return a+b;
    }
    // 返回a-b的差
    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}

