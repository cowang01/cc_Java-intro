//Calculator class with running total that can use basic math functions

public class Calculator {

    private double total;

    public Calculator(){
        this.total = 0.00;
    }



    public double getTotal(){
        return this.total;
    }

    public void add(double numeric){
        this.total += numeric;
    }

    public void subtract(double numeric){
        this.total -= numeric;
    }

    public double clear(){
       return this.total = 0;
    }

    public void multiply(double numeric){
        this.total = this.total * numeric;
    }

    public void divide(double numeric){
        this.total = this.total / numeric;
    }

}//
