package buzz.yixiaobai.flyweightpattern.demo01;

/**
 * 享元模式--外部状态
 * @author yixiaobai
 * @create 2022/04/21 下午4:14
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
