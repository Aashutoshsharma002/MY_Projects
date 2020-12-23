package com.PlayStation;

public class Invoice extends Dealer {
    public void ReadPrize() {
        for(int i=0;i<5;i++) {
            p[i]=new Playstation();
            System.out.println("Enter prize of playstation");
            p[i].prize=sc.nextFloat();
        }
    }
    public float GetTotal() {
        float t = 0;
        for (int i = 0; i < 5; i++) {
            t = t+p[i].prize;
        }
        return t;
    }
    public Invoice() {
        ReadPrize();
        total=GetTotal();
    }
    public float GetAvg()
    {
        return total/5;
    }
    public void print(){
        System.out.println("Here is your Playstation prizes as given");
        for(int i=0;i<5;i++) {
            System.out.println(p[i].prize);
        }
        System.out.println("Total of it "+total);
        System.out.println("Average is here "+GetAvg());
    }
}
