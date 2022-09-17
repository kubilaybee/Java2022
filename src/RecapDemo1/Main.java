package RecapDemo1;

public class Main {
    public static void main(String[] args){
        int numb1=10,numb2=20,numb3=30,bigger=0;

        bigger = numb1;
        if (bigger<numb2)
            bigger = numb2;
        if (bigger<numb3)
            bigger=numb3;
        System.out.println("En buyuk Say= "+bigger);
    }
}
