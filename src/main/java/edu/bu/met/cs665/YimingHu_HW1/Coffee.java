package edu.bu.met.cs665.YimingHu_HW1;

public class Coffee extends Drink{
    private int sugar;
    private int milk;
    public int getSugar(){
        return this.sugar;
    }

    public int getMilk() {
        return milk;
    }

    public void setSugar(int sugar) {
        if(sugar<=3 && sugar >=0) {
            this.sugar = sugar;
        }
        else{
            System.out.println("Too Much Sugar");
        }
    }

    public void setMilk(int milk) {
        if(milk <=3 && milk >=0) {
            this.milk = milk;
        }
        else {
            System.out.println("Too Much Milk");
        }
    }

    public void addSugar(){
        if(this.sugar<3) {

            this.sugar++;
        }
        else{
            System.out.println("Too much sugar");
        }
    }
    public void addMilk(){
        if(this.milk <3 ){
            this.milk++;
        }
        else{
            System.out.println("Too much milk");
        }
    }
}




