package buzz.yixiaobai.compositepattern03;

/**
 * 树枝节点
 * @author yixiaobai
 * @create 2022/04/17 下午6:27
 */
public class Leaf extends Corp{
    // 重写构造函数
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}
