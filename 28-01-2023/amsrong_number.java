import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;
        int n = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }
        System.out.println(n);
        originalNum = num;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
