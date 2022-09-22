package Methods2;

public class Main {
    public static void main(String[] args){
        //void methods
        addUser();
        deleteUser();
        updateUser();
        System.out.println(sumNumbers(2,3));
        System.out.println(giveNumber());
        System.out.println(giveText());
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
