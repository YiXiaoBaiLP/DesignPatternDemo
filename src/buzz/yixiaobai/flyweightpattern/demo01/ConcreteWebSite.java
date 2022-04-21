package buzz.yixiaobai.flyweightpattern.demo01;

/**
 * 具体的网站（具体的享元角色）
 * @author yixiaobai
 * @create 2022/04/21 下午3:07
 */
public class ConcreteWebSite extends WebSite{
    // 网站内容发布的形式（类型）
    // 共享部分，内部状态
    private String type = "";
    // 将网站类型传入进来
    public ConcreteWebSite(String type){
        this.type = type;
    }

    // 这里传入的User对象就相当于享元模式的外部对象，高层模块是可以改变的
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + "使用中，使用者为：" + user.getName());
    }

}
