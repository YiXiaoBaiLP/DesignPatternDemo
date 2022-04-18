package buzz.yixiaobai.compositepattern03;

import java.util.ArrayList;

/**
 * 修改后的场景类-组装模式
 * @author yixiaobai
 * @create 2022/04/17 下午6:30
 */
public class Client {
    public static void main(String[] args) {
        // 组装一个组织结构出来
        Branch ceo = compositeCorpTree();
        // 把ceo信息打印出来
        System.out.println(ceo.getInfo());
        // 所有员工信息
        System.out.println(getTreeInfo(ceo));

    }
    // 把整个树组装起来
    public static Branch compositeCorpTree(){
        // 经理CEO
        Branch root = new Branch("王大麻子", "总经理", 100000);
        // 三个部门经理
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部门经理", 30000);
        // 三个组长
        Branch firstDevGroup = new Branch("杨三也斜","开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长", 6000);
        // 所有员工
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副经理", 20000);
        // 开始组装
        // CEO下面有三个部门经理和一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        // 研发部经理
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        // 研发小组人员
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        secondDevGroup.addSubordinate(g);
        // 销售人员
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        // 财务人员
        financeDep.addSubordinate(j);
        return root;
    }
    // 遍历获取所有的员工信息
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        StringBuilder info = new StringBuilder();
        for(Corp c : subordinateList){
            // 是员工就直接获取
            if(c instanceof Leaf){
                info.append(c.getInfo() + "\n");
            }else{
                info.append(c.getInfo() + "\n" + getTreeInfo((Branch) c));
            }
        }
        return info.toString();
    }
}
