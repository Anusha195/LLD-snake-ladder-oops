public class Player {
    private String name;
    private int loc=0;
    Player(String name){
        this.name=name;
    }
    public void setLoc(int loc){
        this.loc=loc;
    }
    public int getLoc(){
        return this.loc;
    }
    public String getName(){
        return name;
    }
}
