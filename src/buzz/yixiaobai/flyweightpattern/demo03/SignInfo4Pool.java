package buzz.yixiaobai.flyweightpattern.demo03;

/**
 * 享元模式-带对象池的报考信息
 * @author yixiaobai
 * @create 2022/04/21 下午7:12
 */
public class SignInfo4Pool extends SignInfo{
    // 定义一个对象池提取Key值
    private String key;
    // 构造函数获取相同的标志
    public SignInfo4Pool(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
