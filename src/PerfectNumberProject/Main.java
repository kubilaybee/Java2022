package PerfectNumberProject;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /* perfect number project
        6--> 1,2,3 -> 1+2+3 = 6 (Perfect Number)
        28-->1,2,4,7,14 -> 1+2+4+7+14 = 28 (Perfect Number)
        */
        ArrayList<Integer> perfectNumberList = new ArrayList<Integer>();
        int number = 28;
        int total = 0;
        for (int i = 1; i<number;i++){
            if (number%i==0){
                perfectNumberList.add(i);
                total+=i;
            }
        }
        System.out.println("Perfect Number List");
        System.out.println(perfectNumberList);
        if (total==number){
            System.out.println("Perfect Number !!");
        } else{
            System.out.println("The number is not perfect but you are perfect !");
        }
        /*
        for (int test:perfectNumberList)
            System.out.print("->"+test);*/

    }
}
