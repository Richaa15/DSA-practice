

public class GridChecker {
    public static String checkGrid(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Rearrange elements of each row alphabetically
        for (int i = 0; i < rows; i++) {
            Arrays.sort(grid[i]);
        }

        // Check if columns are in alphabetical ascending order
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                if (grid[i][j] > grid[i + 1][j]) {
                    return "no";
                }
            }
        }

        return "yes";
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'}
        };
        System.out.println(checkGrid(grid)); // Output: yes

    }
}
