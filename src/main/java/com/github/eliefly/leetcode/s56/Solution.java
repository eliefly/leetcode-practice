package com.github.eliefly.leetcode.s56;

import java.util.LinkedList;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 示例 2:
 * <p>
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-intervals
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    // 不通过
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        int length = intervals.length;
        if (length == 0 || length == 1) {
            return intervals;
        }
        List<int[]> list = new LinkedList<>();
        int[] first = intervals[0];
        for (int i = 1; i < length; i++) {
            int[] interval = intervals[i];
            if (first[0] > interval[0]) {
                int[] tmp = interval;
                interval = first;
                first = tmp;
            }
            if (first[1] >= interval[0]) {
                first = new int[]{Math.min(first[0], interval[0]), Math.max(first[1], interval[1])};
            } else {
                list.add(first);
                first = interval;
            }
        }
        list.add(first);
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}