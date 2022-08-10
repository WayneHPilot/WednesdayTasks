import java.util.Scanner;

public class sumTo {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();
        int sumTotal = 0;
        while (sumTo !=0) {
            sumTotal = sumTo + sumTotal;
            sumTo = sumTo - 1;
        }
            System.out.print( "Sum of numbers: " +sumTotal);




        }
    }

