import java.util.*;

public class Board {
    private Dice dice;
    private int boardsize;
    private Queue<Player> players;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer ,Ladders> ladders;
    Board(int boardsize,Dice dice,Queue<Player> players,HashMap<Integer, Snakes> snakes,HashMap<Integer ,Ladders> ladders){
        this.boardsize=boardsize;
        this.dice=dice;
        this.ladders=ladders;
        this.snakes=snakes;
        this.players=players;
    }
    public void startgame(){
        while(true){
            Player p=players.poll();
            int curloc=p.getLoc();
            int nextloc=curloc+dice.rolldice();
            if(nextloc<=boardsize){
                if(snakes.containsKey(nextloc)){
                    System.out.println(p.getName()+"was bitten by snake");
                    Snakes obj=snakes.get(nextloc);
                    nextloc=obj.getEndPoint();
                }else if(ladders.containsKey(nextloc)){
                    System.out.println(p.getName()+"got a ladder");
                    Ladders obj=ladders.get(nextloc);
                    nextloc=obj.getEndPoint();
                }
                curloc=nextloc;
                System.out.println(p.getName()+" Moved to "+curloc);
                if(curloc==boardsize){
                    System.out.println(p.getName()+" won the game");
                    break;
                }
                p.setLoc(curloc);
            }
            players.add(p);
        }
    }
}
