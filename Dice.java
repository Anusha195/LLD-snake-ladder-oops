public class Dice {
    private int noofdice;
    Dice(int noofdice){
        this.noofdice=noofdice;
    }
    public int rolldice(){
        return ((int) (Math.random()*(6*noofdice-1*noofdice))+1);
    }
}
class Singledice extends Dice{
    @SuppressWarnings("unused")
    private int noofdice=1;
    Singledice(){
        super(1);
    }
    public int rolldice(){
        int ran=((int) (Math.random()*(6-1))+1);
        if(ran==6){
            while(true){
                ran=6+((int) (Math.random()*(6-1))+1);
                if(ran==12){
                    ran=12+((int) (Math.random()*(6-1))+1);
                    if(ran==18){
                        System.out.println("3 6's in a row not valid");
                        break;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
        return ran;
    }
}
