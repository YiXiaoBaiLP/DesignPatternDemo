package buzz.yixiaobai.compositepattern03;

import java.util.ArrayList;

/**
 * 树枝节点
 * @author yixiaobai
 * @create 2022/04/17 下午6:27
 */
public class Branch extends Corp{

    ArrayList<Corp> subordinateList = new ArrayList<>();
    // 必须重写构造函数
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    // 增加一个下属
    public void addSubordinate(Corp corp){
        this.subordinateList.add(corp);
    }
    // 获取自己下所有的下属
    public ArrayList<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
