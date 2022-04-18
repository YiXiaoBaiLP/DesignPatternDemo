package buzz.yixiaobai.compositepattern05;

/**
 * 透明组合模式—树结构遍历
 * @author yixiaobai
 * @create 2022/04/18 下午12:12
 */
public class Client {
    // 通过递归遍历树
    public static void display(Component root){
        for(Component c : root.getChildren()){
            if(c instanceof Leaf){
                // 叶子节点
                c.doSomething();
            }else{
                // 树枝节点
                // 不需要强制转换
                display(c);
            }
        }
    }
}
