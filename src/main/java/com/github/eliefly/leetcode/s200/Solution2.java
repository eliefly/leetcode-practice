package com.github.eliefly.leetcode.s200;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 * <p>
 * 示例 1:
 * 输入:
 * [
 * ['1','1','1','1','0'],
 * ['1','1','0','1','0'],
 * ['1','1','0','0','0'],
 * ['0','0','0','0','0']
 * ]
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入:
 * [
 * ['1','1','0','0','0'],
 * ['1','1','0','0','0'],
 * ['0','0','1','0','0'],
 * ['0','0','0','1','1']
 * ]
 * 输出: 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-islands
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution2 {

    private static final int[][] DIRECTS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int rows, cols;

    public int numIslands(char[][] grid) {
        int count = 0;
        this.rows = grid.length;
        if (rows == 0) {
            return count;
        }
        this.cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
//                    Queue<int[]> queue = new LinkedList<>();
//                    count++;
//                    queue.add(new int[]{i, j});
//                    visited[i][j] = true;
//                    while (!queue.isEmpty()) {
//                        int[] curPoint = queue.poll();
//                        int curX = curPoint[0];
//                        int curY = curPoint[1];
//                        for (int k = 0; k < DIRECTS.length; k++) {
//                            int newX = curX + DIRECTS[k][0];
//                            int newY = curY + DIRECTS[k][1];
//                            if (inArea(newX, newY) && grid[newX][newY] == '1' && !visited[newX][newY]) {
//                                queue.add(new int[]{newX, newY});
//                                visited[newX][newY] = true;
//                            }
//                        }
//                    }

                    Queue<Integer> queue = new LinkedList<>();
                    count++;
                    queue.add(i * cols + j);
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        Integer cur = queue.poll();
                        int curX = cur / cols;
                        int curY = cur % cols;
                        for (int k = 0; k < DIRECTS.length; k++) {
                            int newX = curX + DIRECTS[k][0];
                            int newY = curY + DIRECTS[k][1];
                            if (inArea(newX, newY) && grid[newX][newY] == '1' && !visited[newX][newY]) {
                                queue.add(newX * cols + newY);
                                visited[newX][newY] = true;
                            }
                        }
                    }

                }
            }
        }
        return count;
    }

    private boolean inArea(int row, int col) {
        return (row >= 0 && row < rows && col >= 0 && col < cols);
    }
}