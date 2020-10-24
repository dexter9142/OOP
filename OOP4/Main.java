package OOP4;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
        Expression expression = new Expression();
        expression.getString();
        System.out.println("Expression correctness from POV of parentheses: "+expression.check());


            File temp = new File("OOP4\\three_expressions.txt");
            Scanner file = new Scanner(temp);
            String a = file.nextLine();

            System.out.println("\n");
            expression.getString3(a);
            System.out.println("Expression correctness from POV of parentheses: "+expression.check());

            String b = file.nextLine();

            expression.getString3(b);
            System.out.println("Expression correctness from POV of parentheses: "+expression.check());

            String c = file.nextLine();

            expression.getString3(c);
            System.out.println("Expression correctness from POV of parentheses: "+expression.check());
        }
    }
