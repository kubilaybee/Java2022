package MultiDimensionalArrayDemo;

public class Main {
    public static void main(String[] args){
        // multiDimensionalArrayDemo
        String[][] city = new String[2][2];
        city[0][0] = "Ist1";
        city[0][1] = "Ist2";
        city[1][0] = "Ist3";
        city[1][1] = "Ist4";
        for (int i = 0; i<2;i++){
            for (int j = 0; j<2;j++){
                System.out.println("------------------");
                System.out.println(city[i][j]);
            }
        }
    }
}
