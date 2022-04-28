package buzz.yixiaobai.visitorpattern.demo01;

/**
 * @author yixiaobai
 * @create 2022/04/27 下午7:47
 */
public class Success extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手很成功 ");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手很成功 ");
    }
}
