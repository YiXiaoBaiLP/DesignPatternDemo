package buzz.yixiaobai.templatepattern.demo01;

/**
 * 抽象类，表示豆浆
 * @author yixiaobai
 * @create 2022/04/26 下午3:03
 */
public abstract class SoyaMilk {

    /**
     * 模版方法，make，模版方法可以做成final，不让子类去覆盖
     */
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 1、选材料
     */
    void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    /**
     * 2、添加不同的配料，抽象方法，子类具体实现
     */
    abstract void addCondiments();

    /**
     * 3、浸泡
     */
    void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡，需要3个小时");
    }

    /**
     * 4、打碎
     */
    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机中打碎");
    }
}
