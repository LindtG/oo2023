import java.io.*;
import java.util.Scanner;
class Main {

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int num1;
        int num2;

        System.out.println("Enter the first integer: ");
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();

        System.out.println("Enter the second integer: ");
        Scanner a = new Scanner(System.in);
        num2 = a.nextInt();


        Main obj = new Main();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}
