package com.github.eliefly.leetcode.s75;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * <p>
 * 进阶：
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution1 {
    public void sortColors(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }
        int zero = 0, i = 0;
        int two = length;

        while (i < two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                zero++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                two--;
                swap(nums, i, two);
            }
        }

    }

    private void swap(int[] nums, int i, int zero) {
        int tmp = nums[i];
        nums[i] = nums[zero];
        nums[zero] = tmp;
    }


    /*public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }

        // all in [0, zero) = 0
        // all in [zero, i) = 1o
        // all in [two, len - 1] = 2

        // 循环终止条件是 i == two，那么循环可以继续的条件是 i < two
        // 为了保证初始化的时候 [0, zero) 为空，设置 zero = 0，
        // 所以下面遍历到 0 的时候，先交换，再加
        int zero = 0;

        // 为了保证初始化的时候 [two, len - 1] 为空，设置 two = len
        // 所以下面遍历到 2 的时候，先减，再交换
        int two = len;
        int i = 0;
        // 当 i == two 上面的三个子区间正好覆盖了全部数组
        // 因此，循环可以继续的条件是 i < two
        while (i < two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                zero++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                two--;
                swap(nums, i, two);
            }
        }
    }*/
}