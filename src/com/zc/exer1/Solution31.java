package com.zc.exer1;

import java.util.Stack;

/**
 * @ClassName Solution31
 * @Description 剑指offer31.栈的压入、弹出序列
 *              输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 *              假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1}
 *              是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author zngchao  Email:zengchao0905@163.com
 * @Date 2021/9/5 12:59
 * @Version 1.0
 */
public class Solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> res = new Stack<>();
        int p = 0;
        for (int i = 0; i < pushed.length; i++) {
            res.push(pushed[i]);
            while (!res.empty() && popped[p] == res.peek()){
                res.pop();
                p++;
            }
        }
        return res.empty();
    }
}
