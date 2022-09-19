package FindNumberProject;

public class Main {
    public static void main(String[] args){
        int[] numbers = new int[]{1,2,3,4,5,7,9,0};
        int findNumber = 5;
        boolean isTrue = false;

        for (int numb : numbers){
            if (findNumber==numb){
                isTrue = true;
                break;
            }
        }
        if (isTrue){
            System.out.println("The number in avaible");
        } else{
            System.out.println("The number not avaible");
        }
    }
}
