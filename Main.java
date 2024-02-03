import processing.core.PApplet;

public class Main extends PApplet {
    Grid grid = new Grid();
    Ant ant = new Ant();

    public void settings() {
        size(Config.SIZE_X, Config.SIZE_Y);
    }

    public void draw() {
        for (int y = 0; y < Config.HEIGHT; y++) {
            for (int x = 0; x < Config.WIDTH; x++) {
                if (grid.grid[y][x] == 1) {
                    fill(255);
                } else {
                    fill(0);
                }
                rect(x * Config.TILE_SIZE, y * Config.TILE_SIZE, Config.TILE_SIZE, Config.TILE_SIZE);
            }
        }
        step();
    }

    public void step() {
        //ant's movement
        if (grid.grid[ant.x][ant.y] == 0) {
            grid.grid[ant.x][ant.y] = 1;
            ant.white_tile();
        }
        else if (grid.grid[ant.x][ant.y] == 1) {
            grid.grid[ant.x][ant.y] = 0;
            ant.black_tile();
        }
        ant.move_forward();
    }

    public static void main(String[] args) {
        String[] processingArgs = {"Main"};
        Main main = new Main();
        PApplet.runSketch(processingArgs, main);
    }
}
