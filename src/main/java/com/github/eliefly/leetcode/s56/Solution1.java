package com.github.eliefly.leetcode.s56;

import java.util.Arrays;
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
class Solution1 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return null;
        }
        int length = intervals.length;
        if (length == 0 || length == 1) {
            return intervals;
        }
        Arrays.parallelSort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new LinkedList<>();
        int[] first = intervals[0];
        for (int i = 1; i < length; i++) {
            int[] interval = intervals[i];
            if (first[1] >= interval[0]) {
                first = new int[]{first[0], Math.max(first[1], interval[1])};
            } else {
                list.add(first);
                first = interval;
            }
        }
        list.add(first);
        /*int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;*/
        return list.toArray(new int[0][]);
    }

//    public int[][] merge(int[][] intervals) {
//        List<int[]> res = new ArrayList<>();
//        if (intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);
//        // 对起点终点进行排序
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        int i = 0;
//        while (i < intervals.length) {
//            int left = intervals[i][0];
//            int right = intervals[i][1];
//            // 如果有重叠，循环判断哪个起点满足条件
//            while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
//                i++;
//                right = Math.max(right, intervals[i][1]);
//            }
//            // 将现在的区间放进res里面
//            res.add(new int[]{left, right});
//            // 接着判断下一个区间
//            i++;
//        }
//        return res.toArray(new int[0][]);
//    }
}