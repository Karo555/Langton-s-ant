import java.util.Random;

public class Ant {
    private int direction;
    public int id, x, y, r, g, b;

    public Ant(int id, Random random) {
        this.id = id;
        // spawning ant at random location
        this.x = random.nextInt(Config.WIDTH);
        this.y = random.nextInt(Config.HEIGHT);
        // ant's direction
        // 0-north, 1-east, 2-south, 3-west
        this.direction = random.nextInt(4);
        // ant's color
        this.r = 32 + random.nextInt(128);
        this.g = 32 + random.nextInt(128);
        this.b = 32 + random.nextInt(128);
    }
    //movement
    public void move_forward() {
        switch (direction) {
            case 0 -> y--;
            case 1 -> x++;
            case 2 -> y++;
            case 3 -> x--;
        }
        this.x = Math.floorMod(x, Config.WIDTH);
        this.y = Math.floorMod(y, Config.HEIGHT);
    }
    //changing direction
    public void black_tile() {
        direction = switch (direction) {
            case 0 -> 3;
            case 1 -> 0;
            case 2 -> 1;
            case 3 -> 2;
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }
    public void white_tile() {
        direction = switch (direction) {
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 3;
            case 3 -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }
}
