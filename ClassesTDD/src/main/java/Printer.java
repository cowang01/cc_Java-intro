public class Printer {

    private int paper;
    private boolean fillUp;

    public Printer(int startPaper) {
        this.paper = startPaper;
        this.fillUp = false;
    }



    public int getPaper(){
        return this.paper;
    }

    public void print(int qty){
        if (this.paper > 0) {
            for (int n = 0; n <= qty - 1; n++) {
                this.paper -= 1;
                if (this.paper == 0){
                    this.fillUp = true;
                    break;
                }
            }
        }
    }
}//
