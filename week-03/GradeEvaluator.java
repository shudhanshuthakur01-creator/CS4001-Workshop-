import java.util.Scanner;

public class GradeEvaluator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int grade;
        
        // this variable stores grade
        System.out.println("Enter your grade:");
        grade = input.nextInt();

        if (grade >= 40) {
          System.out.println("Pass");
               } else {
          System.out.println("Fail");
            }

        input.close();
    }
}
