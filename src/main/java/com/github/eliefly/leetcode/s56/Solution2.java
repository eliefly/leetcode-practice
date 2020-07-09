package com.github.eliefly.leetcode.s56;

import java.util.ArrayList;
import java.util.Arrays;
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
class Solution2 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        int length = intervals.length;
        if (length == 0 || length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < length) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < length - 1 && right >= intervals[i + 1][0]) {
                i++;
                right = Math.max(intervals[i][1], right);
            }
            list.add(new int[]{left, right});
            i++;
        }
        return list.toArray(new int[0][]);
    }
}