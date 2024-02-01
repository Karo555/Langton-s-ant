import java.util.Random;

public class Ant {
    Random random= new Random();
    //spawning ant at random location
    int x= random.nextInt(200);
    int y= random.nextInt(200);
    //ant's direction
    //0-north, 1-east, 2-south, 3-west
    int direction= random.nextInt(4);
    //movement
    public void move_forward() {
        if (direction==0) {
            y--;
        }
        else if (direction==1) {
            x++;
        }
        else if (direction==2) {
            y++;
        }
        else if (direction==3) {
            x--;
        }
    }
    //changing direction
    public void black_tile() {
        if (direction==0) {
            direction=3;
        }
        else if (direction==1) {
            direction=0;
        }
        else if (direction==2) {
            direction=1;
        }
        else if (direction==3) {
            direction=2;
        }
    }
    public void white_tile() {
        if (direction==0) {
            direction=1;
        }
        else if (direction==1) {
            direction=2;
        }
        else if (direction==2) {
            direction=3;
        }
        else if (direction==3) {
            direction=0;
        }
    }
}
