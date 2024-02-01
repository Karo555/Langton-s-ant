import java.util.Random;

public class Grid {
    Random random= new Random();
    int[][] grid = new int[Config.HEIGHT][Config.WIDTH];
    //creating random grid filled with black/white tiles
    public Grid() {
        for (int i = 0; i < Config.HEIGHT; i++) {
            for (int j = 0; j < Config.WIDTH; j++) {
                int r = 0;//random.nextInt(2);
                grid[i][j] = r;
            }
        }
    }
}
