import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter in your height (m): ");
    double height = in.nextDouble();
    Systeml.out.println("Enter in your weight (kg): ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height);
    System.ouut.println(bmi);
  }
}
