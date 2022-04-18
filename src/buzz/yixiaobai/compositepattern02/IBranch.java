package buzz.yixiaobai.compositepattern02;

import java.util.ArrayList;

/**
 * 树枝接口
 * @author yixiaobai
 * @create 2022/04/17 下午5:28
 */
public interface IBranch extends ICorp{

    // 增加员工或经理
    void addSubordinate(ICorp corp);

    // 获取下属信息
    ArrayList<ICorp> getSubordinate();

    // 删除下属信息
    int removeSubordinate(ICorp corp);
}
