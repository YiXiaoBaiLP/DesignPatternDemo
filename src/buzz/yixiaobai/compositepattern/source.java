package buzz.yixiaobai.compositepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 组合模式源码分析
 * @author yixiaobai
 * @create 2022/04/17 下午3:50
 */
public class source {
    public static void main(String... args){

        /*
            说明：
                1、Map就是一个抽象的构建（类似我们的Component）
                2、HashMap是一个中间构建（composite），实现/继承了相关方法
                    put、putAll
                3、Node是HashMap的静态内部类，类似Leaf叶子节点，这里没有put，putall
                    static class Node<K,V> implements Map.Entry<K,V>
         */
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(0, "东游记"); // 直接存放叶子节点（Node）

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(1, "西游记");
        hashMap2.put(2, "红楼梦");

        hashMap1.putAll(hashMap2);
        System.out.println(hashMap1);
    }
}
