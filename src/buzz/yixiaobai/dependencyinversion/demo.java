package buzz.yixiaobai.dependencyinversion;

/**
 * 依赖倒置
 * @author yixiaobai
 * @create 2022/04/19 下午5:12
 */
public class demo {
    public static void main(String[] args) {
        // 高层模块不应该依赖底层模块，二者都改依赖其抽象
        // Person类并不知道I接口的存在
        Person person = new Person();
        person.setI(new Email());
        person.receive();
    }
}

interface I<T> {
    T getInfo();
}

class Email implements I<String> {

    @Override
    public String getInfo() {
        return "电子邮件信息：Hello World!";
    }
}

class Person {
    private I i;
    // 使用setter进行赋值
    public void setI(I i){
        this.i = i;
    }

    public void receive() {
        System.out.println(i.getInfo());
    }
}