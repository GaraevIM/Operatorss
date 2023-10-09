import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[7];
        for (int w = 0; w < numbers.length; w++) {
            numbers[w] = w * 10;
            System.out.print(numbers[w] + " ");
        }




        /*int salary = 65789;
        int total = 0;
        for (int k = 0; total < 1_000_000; k++) {
            total = total + total / 100;
            total = total + salary;
            if (k % 5 == 0) {
            System.out.println(total);
            */

        /*int age = 25;
        if (age >= 18 && age < 21) {
            System.out.println("You can driving car, but can`t drink alcohol");
            if (age >= 21) {
                System.out.println("You can driving car and drink alcohol");
            }} else
            System.out.println("Fuck off");
        */
    }
}
