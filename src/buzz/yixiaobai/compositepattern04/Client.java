package buzz.yixiaobai.compositepattern04;

/**
 * 场景类
 * @author yixiaobai
 * @create 2022/04/18 上午12:12
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        // 建立一个整体
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root){
        for(Component c : root.getChildren()){
            if (c instanceof Leaf) {
                // 叶子节点
                c.doSomething();
            }else{
                // 树枝节点
                display((Composite) c);
            }
        }
    }
}
