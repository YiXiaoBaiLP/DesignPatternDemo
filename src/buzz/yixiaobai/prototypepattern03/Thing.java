package buzz.yixiaobai.prototypepattern03;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 * @author yixiaobai
 * @create 2022/04/14 下午4:44
 */
public class Thing implements Cloneable{

    // 定义一个私有变量
    private List<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    // 设置ArrayList的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }
    // 获取ArrayList的值
    public List<String> getValue() {
        return this.arrayList;
    }
}
