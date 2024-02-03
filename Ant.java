import java.util.Random;

public class Ant {
    Random random = new Random();
    //spawning ant at random location
    int x = random.nextInt(Config.WIDTH);
    int y = random.nextInt(Config.HEIGHT);
    //ant's direction
    //0-north, 1-east, 2-south, 3-west
    int direction = random.nextInt(4);
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
            case 2 -> 2;
            case 3 -> 1;
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
        }
    }
}
