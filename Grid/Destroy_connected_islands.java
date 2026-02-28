public class Destroy_connected_islands {

    // This function destroys one island starting at (r, c)
    public static void destroyIsland(char[][] grid, int r, int c) {

        // Step 1: Boundary check + water check
        if (r < 0 || c < 0 ||
            r >= grid.length ||
            c >= grid[0].length ||
            grid[r][c] == '0') {
            return;
        }

        // Step 2: Convert current land into water
        grid[r][c] = '0';

        // Step 3: Go in all 4 directions
        destroyIsland(grid, r + 1, c); // down
        destroyIsland(grid, r - 1, c); // up
        destroyIsland(grid, r, c + 1); // right
        destroyIsland(grid, r, c - 1); // left
    }

    // Function to print grid
    public static void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1','1','0'},
            {'1','0','0'},
            {'0','0','1'}
        };

        System.out.println("Before destroying island:");
        printGrid(grid);

        destroyIsland(grid, 0, 0); // destroy island at top-left

        System.out.println("\nAfter destroying island:");
        printGrid(grid);
    }
}