import java.util.Random;

public class BurnTrees {
    private int[][] map;
    private int ticks;
    private static final int TREE = 2;
    private static final int FIRE = 1;
    private static final int ASH = 3;
    private static final int SPACE = 0;
    private Frontier frontier;

    public BurnTrees(int width, int height, double density) {
        map = new int[height][width];
        frontier = new Frontier(); 
        Random random = new Random();
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                if (random.nextDouble() < density) {
                    map[r][c] = TREE;
                }
            }
        }
        start();
    }

    public void tick() {
        ticks++;
        int frontierSize = frontier.size(); 
        for (int i = 0; i < frontierSize; i++) {
            int[] current = frontier.remove(); 
            int row = current[0];
            int col = current[1];
            map[row][col] = ASH; 
            spreadFire(row, col); 
        }
    }

    public boolean done() {
        return frontier.size() == 0; 
    }

    private void start() {
        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == TREE) {
                map[i][0] = FIRE;
                frontier.add(new int[]{i, 0}); 
            }
        }
    }

    private void spreadFire(int row, int col) {
        spreadFireTo(row - 1, col); 
        spreadFireTo(row + 1, col); 
        spreadFireTo(row, col - 1); 
        spreadFireTo(row, col + 1); 
    }

    private void spreadFireTo(int row, int col) {
        if (row >= 0 && row < map.length && col >= 0 && col < map[0].length && map[row][col] == TREE) {
            map[row][col] = FIRE;
            frontier.add(new int[]{row, col}); 
        }
    }

    
    public static void main(String[]args){
      int WIDTH = 20;
      int HEIGHT = 20;
      int DELAY = 2000;
      double DENSITY = .7;
      if(args.length > 1){
        WIDTH = Integer.parseInt(args[0]);
        HEIGHT = Integer.parseInt(args[1]);
        DENSITY = Double.parseDouble(args[2]);
      }
      if(args.length > 3){
        DELAY = Integer.parseInt(args[3]);
      }
      BurnTrees b = new BurnTrees(WIDTH,HEIGHT,DENSITY);


      int ans = b.animate(DELAY);//animate all screens
      System.out.println(ans);//print the final answer
      

      //int ans = b.outputAll();//print all screens one after another
      //System.out.println(ans);//print the final answer
    }


  /***********************DO NOT UPDATE THINGS BELOW HERE**************************/

  /*DO NOT UPDATE THIS
   *PLEASE READ SO YOU SEE HOW THE SIMULATION IS SUPPOSED TO WORK!!!
   */
  public int run(){
    while(!done()){
      tick();
    }
    return getTicks();
  }


  /*DO NOT UPDATE THIS*/
  public int getTicks(){
    return ticks;
  }

  /*DO NOT UPDATE THIS*/
  public String toString(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
      for (int c = 0; c < map[i].length; c++) {
        if(map[i][c]==SPACE)
          builder.append(" ");
        else if(map[i][c]==TREE)
          builder.append("@");
        else if(map[i][c]==FIRE)
          builder.append("w");
        else if(map[i][c]==ASH)
          builder.append(".");
      }
      builder.append("\n");
    }
    return builder.toString();
  }

  /*DO NOT UPDATE THIS*/
  public String toStringColor(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
      for (int c = 0; c < map[i].length; c++) {
        if(map[i][c]==0)
          builder.append(" ");
        else if(map[i][c]==2)
          builder.append(Text.color(Text.GREEN)+"@");
        else if(map[i][c]==1)
          builder.append(Text.color(Text.RED)+"w");
        else if(map[i][c]==3)
          builder.append(Text.color(Text.DARK)+".");
      }
      builder.append("\n"+Text.RESET);
    }
    return builder.toString()+ticks+"\n";
  }

  /*DO NOT UPDATE THIS*/
  public int animate(int delay) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.println(Text.go(1,1)+toStringColor());
    Text.wait(delay);
    while(!done()){
      tick();
      System.out.println(Text.go(1,1)+toStringColor());
      Text.wait(delay);
    }
    return getTicks();
  }

  /*DO NOT UPDATE THIS*/
  public int outputAll(){
    System.out.println(toString());
    while(!done()){
      tick();
      System.out.println(toString());
    }
    return getTicks();
  }


}