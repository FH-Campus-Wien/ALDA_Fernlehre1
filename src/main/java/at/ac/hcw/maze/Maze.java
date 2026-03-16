package at.ac.hcw.maze;

public class Maze {
    private final char[][] maze;
    private final int rows;
    private final int cols;

    /**
     * Constructor for the maze.
     * @param initial matrix of chars containing the maze.
     */
    public Maze(char[][] initial) {
        if (initial == null || initial.length == 0 || initial[0].length == 0) {
            throw new IllegalArgumentException("Maze must not be empty");
        }
        this.rows = initial.length;
        this.cols = initial[0].length;
        this.maze = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            if (initial[r].length != cols) {
                throw new IllegalArgumentException("Maze must be rectangular");
            }
            System.arraycopy(initial[r], 0, this.maze[r], 0, cols);
        }
    }

    /**
     * Pretty prints the maze.
     */
    public void print() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(maze[r][c]);
                if (c < cols - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    /**
     * The recursive method responsible for solving the maze.
     * @param row the row to start from.
     * @param col the column to start from.
     * @return the number of steps taken to the target or 0 if there is no way to reach the target.
     */
    public int escape(int row, int col) {
        // TODO implement escape by means of backtracking
        return -1;
    }

    public static void main(String[] args) {
        char[][] sample = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', 'S', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#'},
                {'#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#'},
                {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', ' ', '#', '#', '#', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
                {'#', ' ', '#', '#', '#', '#', ' ', '#', 'T', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        // TODO Test your implementation also here!
    }
}
