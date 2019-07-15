public class WaterBottle {

    private int volume;

    public WaterBottle(int startVolume){
        this.volume = startVolume;
    }


    public int getVolume(){
        return this.volume;
    }

    public void drinkOnce(){
        if (this.volume > 0){
            this.volume -= 10;
        }

    }

    public void emptyAll(){
        this.volume = 0;
    }

    public void fillUp(){
        this.volume = 100;
    }


}
