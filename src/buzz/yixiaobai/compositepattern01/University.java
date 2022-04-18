package buzz.yixiaobai.compositepattern01;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是非叶子节点
 * @author yixiaobai
 * @create 2022/04/17 下午3:08
 */
public class University extends OrganizationComponent{
    // List中存放的College
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public University(String name, String des){
        super(name, des);
    }

    // 重写父类的add()方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    // 重写父类的remove()方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    protected void print() {
        System.out.println("---------------"+  getName() +"-----------------");
        // 遍历organizationComponents集合
        for(OrganizationComponent organizationComponent: organizationComponents){
            organizationComponent.print();
        }
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getDes(){
        return super.getDes();
    }
}
