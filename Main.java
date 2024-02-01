public class Main {
    public static void main(String[] args) {
        Grid grid= new Grid();
        grid.createGrid();
        Ant ant= new Ant();
        //ant's movement
        for (int i = 0; i < 10000; i++) {
            if (grid.grid[ant.x][ant.y]==0) {
                grid.grid[ant.x][ant.y]=1;
                ant.white_tile();
            }
            else if (grid.grid[ant.x][ant.y]==1) {
                grid.grid[ant.x][ant.y]=0;
                ant.black_tile();
            }
            ant.move_forward();
        }
    }
}
