package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 访问者模式-场景类
 * @author yixiaobai
 * @create 2022/04/29 下午2:14
 */
public class Client {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            //获得元素对象
            Element el = ObjectStructure.createElement();
            // 接受访问者访问
            el.accept(new Visitor());
        }
    }
}
