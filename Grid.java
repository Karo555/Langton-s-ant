import java.util.Random;

public class Grid {
    Random random= new Random();
    int[][] grid = new int[200][200];
    //creating random grid filled with black/white tiles
    public void createGrid() {
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                int r = random.nextInt(2);
                grid[i][j] = r;
            }
        }
    }
}
