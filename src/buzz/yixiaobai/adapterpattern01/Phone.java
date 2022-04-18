package buzz.yixiaobai.adapterpattern01;

/**
 * 高层类
 * @author yixiaobai
 * @create 2022/04/18 下午7:20
 */
public class Phone {

    public void charging(IVoltage5V voltage5V){
        int des5v = voltage5V.output5v();
        if(des5v == 5){
            System.out.println(" 没有问题，可以充电～～ ");
        }else{
            System.out.println(" 电压比较高，不能给手机充电！！ ");
        }
    }
}
