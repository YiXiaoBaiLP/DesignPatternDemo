package buzz.yixiaobai.flyweightpattern.demo06;

/**
 * 享元模式-使用Java基本类型做外部状态（使用基本类型效率高）
 * @author yixiaobai
 * @create 2022/04/21 下午11:12
 */
public class Client02 {
    public static void main(String[] args){{
        //初始化对象池
        String key1 = "科目1上海";
        String key2 = "科目1上海";
        SignInfoFactory02.getSignInfo(key1);
        //  计算执行100万次需要的时间
        long currentTiem = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            SignInfoFactory02.getSignInfo(key2);
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (tailTime - currentTiem) + " ms");
    }

    }
}
