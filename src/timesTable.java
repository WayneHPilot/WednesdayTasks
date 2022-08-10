import java.util.Scanner;

public class timesTable {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int timesTable, counter, total;

        System.out.print("What times table would you like: ");
        timesTable = reader.nextInt();
        System.out.print("To what value would you like to display to: ");
        counter = reader.nextInt();

        for(int i = 0; i < counter; i++){
            total = timesTable * i;
            System.out.println(timesTable + " x " + i + " = " + total);

        }

    }
}
