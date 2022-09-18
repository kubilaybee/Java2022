package RecapDemo2;

public class Main {
    public static void main(String[] args){
        // recapDemo2
        double[] myList = {1.4,1.3,4.5,5.9};
        double total = 0;
        double maxNumber = 0;

        for (double test : myList){
            if (maxNumber<test)
                maxNumber=test;
            total+=test;
            System.out.println(test);
        }
        System.out.println("total=>"+total);
        System.out.println("maxNumber=>"+maxNumber);
    }
}
