import processing.core.PApplet;

import java.util.Random;

public class Main extends PApplet {
    private final static Random random = new Random();
    private final static Grid grid = new Grid();
    private final static Ant[] ants = new Ant[Config.NUMBER_OF_ANTS];

    public Main() {
        for (int i = 0; i < Config.NUMBER_OF_ANTS; i++) {
            ants[i] = new Ant(i, random);
        }
    }

    public void settings() {
        size(Config.SIZE_X, Config.SIZE_Y);
    }

    public void draw() {
        for (int y = 0; y < Config.HEIGHT; y++) {
            for (int x = 0; x < Config.WIDTH; x++) {
                int id = grid.grid[y][x];
                if (id == -1) {
                    fill(0);
                } else {
                    fill(ants[id].r, ants[id].g, ants[id].b);
                }
                for (Ant ant : ants) {
                    if (ant.y == y && ant.x == x) {
                        fill(ant.r + 96, ant.g + 96, ant.b + 96);
                    }
                }
                rect(y * Config.TILE_SIZE, x * Config.TILE_SIZE, Config.TILE_SIZE, Config.TILE_SIZE);
            }
        }
        step();
    }

    public void step() {
        for (Ant ant : ants) {
            //ant's movement
            if (grid.grid[ant.y][ant.x] == -1) {
                grid.grid[ant.y][ant.x] = ant.id;
                ant.white_tile();
            } else {
                grid.grid[ant.y][ant.x] = -1;
                ant.black_tile();
            }
            ant.move_forward();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
