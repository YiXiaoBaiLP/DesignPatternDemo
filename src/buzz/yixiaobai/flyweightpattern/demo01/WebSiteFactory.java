package buzz.yixiaobai.flyweightpattern.demo01;

import java.util.HashMap;

/**
 * 网站工厂类，根据需要返回一个网站（享元工厂类）
 * @author yixiaobai
 * @create 2022/04/21 下午3:10
 */
public class WebSiteFactory {
    // 集合，从当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据网站类型，返回一个网站，如果没有就创建一个网站，并放入池中
    public WebSite getWebSiteCategory(String type) {
        if ( !pool.containsKey(type)) {
            // 没有，就创建一个网站，并放入池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总和（池中有多少个网站类型）
    public int getWebSiteCount(){
        return pool.size();
    }
}
