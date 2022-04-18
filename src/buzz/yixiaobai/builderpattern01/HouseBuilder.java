package buzz.yixiaobai.builderpattern01;

/**
 * 抽象的构建者->类似与房屋的地基
 * @author yixiaobai
 * @create 2022/04/18 下午7:55
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // 将建造的流程写好，抽象的方法
    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void roofed();

    /**
     * 建造房子，将房子（产品）返回
     * @return
     */
    public House buildHouse(){
        return house;
    }
}
