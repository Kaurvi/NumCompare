import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("Enter first number: ");
            if (input.hasNextDouble())
            {
                num1 = input.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please try again.");
                input.next();
            }
        }

        validInput = false;

        while (!validInput)
        {
            System.out.print("Enter second number: ");
            if (input.hasNextDouble())
            {
                num2 = input.nextDouble();
                validInput = true;
            }
            else
            {
                System.out.println("Invalid input. Please try again.");
                input.next();
            }
        }

        if (num1 == num2)
        {
            System.out.println("The two numbers are equal.");
        } else if (num1 < num2)
        {
            System.out.println("The first number is less than the second number.");
        }
        else
        {
            System.out.println("The second number is less than the first number.");
    }
}