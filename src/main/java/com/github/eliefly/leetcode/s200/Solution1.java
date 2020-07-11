package com.github.eliefly.leetcode.s200;

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
class Solution1 {

    private static final int[][] DIRECTS = {{1, 0}, {0, -1}};
    private boolean[][] visited;
    private int rows, cols;

    public int numIslands(char[][] grid) {
        int count = 0;
        this.rows = grid.length;
        if (rows == 0) {
            return count;
        }
        this.cols = grid[0].length;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        visited[row][col] = true;
        for (int i = 0; i < DIRECTS.length; i++) {
            int newRow = row + DIRECTS[i][0];
            int newCol = col + DIRECTS[i][1];
            if (inArea(newRow, newCol) && grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                dfs(grid, newRow, newCol);

            }
        }
    }

    private boolean inArea(int row, int col) {
        return (row >= 0 && row < rows && col >= 0 && col < cols);
    }
}