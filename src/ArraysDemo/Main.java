package ArraysDemo;

import java.sql.Array;

public class Main {
    public static void main(String[] args){
        // arrays
        String student1 = "testStudent1";
        String student2 = "testStudent2";
        String student3 = "testStudent3";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("####################");
        String[] studentsArr = new String[3];
        studentsArr[0] = student1;
        studentsArr[1] = student2;
        studentsArr[2] = student3;
        // for-each
        for (String test: studentsArr){
            System.out.println(test);
        }
    }
}
