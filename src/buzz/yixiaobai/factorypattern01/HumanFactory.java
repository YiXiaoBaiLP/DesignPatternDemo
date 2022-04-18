package buzz.yixiaobai.factorypattern01;

/**
 * 工厂类
 * @author yixiaobai
 * @create 2022/04/18 下午4:16
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> Human createHuman(Class<T> c) {
        // 定义一个生产的人种
        // 此时并不知道要生产什么人种：黑人、白人或黄人
        Human human = null;
        try {
            // 通过反射来创建类的实例
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch(Exception e){
            System.err.println("人种生产错误");
        }
        return human;
    }
}
