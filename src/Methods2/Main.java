package Methods2;

public class Main {
    public static void main(String[] args){
        // methods
        addUser();
        deleteUser();
        updateUser();
        System.out.println(sumNumbers(2,3));
        System.out.println(giveNumber());
        System.out.println(giveText());
        System.out.println(sum(3,4,5,6,7));
    }

    // Variable Arguments => numbers arr
    public static int sum(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void addUser(){
        System.out.println("Added!!");
    }
    public static void deleteUser(){
        System.out.println("Deleted!!");
    }
    public static void updateUser(){
        System.out.println("Updated!!");
    }
    public static int sumNumbers(int number1,int number2){
        return number1 + number2;
    }
    public static int giveNumber(){
        return 1001;
    }
    public static String giveText(){
        return "Hello !!";
    }
}
