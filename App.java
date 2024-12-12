import java.util.*;

public class App {
    public static void main(String[] args){
        System.out.println("Let's start the game");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the boardsize");
        int bsize = sc.nextInt();
        System.out.println("enter the noof dices");
        int ndice = sc.nextInt();
        Dice dice = new Dice(ndice);
        System.out.println("enter noof snakes");
        int nsnakes=sc.nextInt();
        HashMap<Integer, Snakes> snakeMap=new HashMap<>();
        sc.nextLine();
        while (nsnakes-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Snakes snake = new Snakes(st, en);
            snakeMap.put(st, snake);
        }
        System.out.println("enter noof ladders");
        int nladders=sc.nextInt();
        HashMap<Integer, Ladders> ladderMap=new HashMap<>();
        sc.nextLine();
        while (nladders-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Ladders ladd = new Ladders(st, en);
            ladderMap.put(st, ladd);
        }
        Queue<Player> players = new LinkedList<Player>();
        System.out.println("enter noof players");
        int np=sc.nextInt();
        sc.nextLine();
        System.out.println("enter their names");
        while(np-- >0){
            String name=sc.nextLine();
            Player p = new Player(name);
            players.add(p);
        }
        Board b=new Board(bsize, dice, players, snakeMap, ladderMap);
        b.startgame();
    }
}
