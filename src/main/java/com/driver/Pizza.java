package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean cheese;
    protected boolean takeaway;
    protected boolean topping;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheese=false;
        this.takeaway=false;
        this.topping=false;
        if(isVeg){
            this.price=300;
            this.bill="Veg pizza base price : 300";
        }else{
            this.price=400;
            this.bill="Non-veg pizza base price : 400";
        }
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheese){
            this.price+=80;
            this.bill+="\n"+"Extra Cheese Added: 80";
            this.cheese=true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.topping){
            if(isVeg) {
                this.bill += "\n" + "Extra Toppings Added: 70";
                this.price += 70;
            }
            else{
                this.bill += "\n" + "Extra Toppings Added: 120";
                this.price+=120;
            }

            this.topping=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeaway){
            this.price+=20;
            this.bill+="\n"+"Paperbag Added: 20";
            this.takeaway=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill+="\n"+"Total Price:"+this.price;
        return this.bill;
    }
}
