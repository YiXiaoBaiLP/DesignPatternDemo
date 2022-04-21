package buzz.yixiaobai.flyweightpattern.demo06;

/**
 * @author yixiaobai
 * @create 2022/04/21 下午10:54
 */
public class Client {
    /*
    注意：如果把一个对象最为Map类的键值，一定要确保重写了equals和hashCode方法，否则会出现通过键值搜索失败的情况
    例如：map.get(object)、map.contains(object)等会返回失败的结果
     */
    public static void main(String[] args){
        //初始化对象池
        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);
        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目1");
        state2.setLocation("上海");
        //  计算执行100万次需要的时间
        long currentTiem = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            SignInfoFactory.getSignInfo(state2);
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (tailTime - currentTiem) + " ms");
    }
}
