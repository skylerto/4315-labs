package lab4;

import java.util.Random;

public class Printer {

    public Printer() {
        
    }

    public static void main(String args[]){
        Random r = new Random();

        System.out.println("S0");
        if (r.nextBoolean()) {
             System.out.println("S2");
        } else {
             System.out.println("S1");
             if(r.nextBoolean()){
                System.out.println("S4");
            } else {
                System.out.println("S3");
            }
        }
    }
}
