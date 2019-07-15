public class Printer {

    private int paper;
    private boolean fillUp;
    private int toner;

    public Printer(int startPaper, int startToner) {
        this.paper = startPaper;
        this.toner = startToner;
        this.fillUp = false;
    }



    public int getPaper(){
        return this.paper;
    }

    public void print(int qty, int copies){
        if (this.paper > 0 && this.toner > 0) {
            for (int n = 0; n <= (qty * copies) - 1; n++) {
                this.paper -= 1;
                this.toner -= 1;
                if (this.paper == 0 || this.toner == 0){
                    this.fillUp = true;
                    break;
                }
            }
        }
    }

    public int getToner(){
        return this.toner;
    }

    public boolean getStatus(){
        return this.fillUp;
    }
}//
