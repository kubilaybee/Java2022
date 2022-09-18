package LoopDemo;

public class Main {
    public static void main(String[] args){
        // For Loop
        for (int i = 0; i<7;i++){
            System.out.println(i);
        }
        System.out.println("The forLoop is over..");

        int i = 1;
        // while
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("The whileLoop is over..");

        // do-while
        i = 0;
        do{
            System.out.println(i);
            i+=2;
        } while (i<10);
        System.out.println("do-whileLoop is over");
    }
}
