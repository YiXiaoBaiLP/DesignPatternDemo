package buzz.yixiaobai.flyweightpattern.demo01;

/**
 * 享元模式-客户端
 * @author yixiaobai
 * @create 2022/04/21 下午3:18
 */
public class Client {
    public static void main(String[] args){
        // 创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("user01"));

        // 博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("user02"));

        // 博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("user03"));

        // 博客形式发布的网站
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("user04"));

        System.out.println("共有多少个网站：" + webSiteFactory.getWebSiteCount());
        System.out.println(webSite.hashCode());
        System.out.println(webSite2.hashCode());
        System.out.println(webSite3.hashCode());
        System.out.println(webSite4.hashCode());

    }
}
