package Methods;

public class Main {
    public static void main(String[] args){
        // define the variables
        int[] numbers = new int[]{1,2,3,5,6,8,0};
        int searchNumber = 5;
        //boolean isHere = false;
        // methods
        //isHere = findNumbers(numbers,searchNumber);
        checkNumber(findNumbers(numbers,searchNumber));

    }

    public static void checkNumber(boolean isHere){
        if (isHere){
            System.out.println("The Number is Here !");
        } else {
            System.out.println("The number is Not Here");
        }
    }

    public static boolean findNumbers(int[] numberArr, int searchNumber){
        for(int number:numberArr){
            if (number==searchNumber){
                return true;
            }
        }
        return false;
    }
}
