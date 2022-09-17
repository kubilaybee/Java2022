package SwitchDemo;

public class Main {
    public static void main(String[] args){
        // switch condition
        char yourGrade = 'A';
        switch (yourGrade){
            case 'A':
                System.out.println("Awesome");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Weird !?");
        }
    }
}
