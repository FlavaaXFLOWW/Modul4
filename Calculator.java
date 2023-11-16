import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural (basis e)");
        System.out.println("4. Factorial");
        System.out.print("Pilih operasi yang diinginkan (1/2/3/4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan angka yang ingin dihitung akar kuadratnya: ");
                double number1 = input.nextDouble();
                double result1 = Math.sqrt(number1);
                System.out.println("Hasil akar kuadrat dari " + number1 + " adalah " + result1);
                break;
            case 2:
                System.out.print("Masukkan angka yang ingin dipangkatkan: ");
                double number2 = input.nextDouble();
                System.out.print("Masukkan pangkat yang diinginkan: ");
                double power = input.nextDouble();
                double result2 = Math.pow(number2, power);
                System.out.println(number2 + " pangkat " + power + " adalah " + result2);
                break;
            case 3:
                System.out.print("Masukkan angka yang ingin dihitung logaritma naturalnya: ");
                double number3 = input.nextDouble();
                double result3 = Math.log(number3);
                System.out.println("Logaritma natural dari " + number3 + " adalah " + result3);
                break;
            case 4:
                System.out.print("Masukkan angka yang ingin dihitung factorialnya: ");
                int number4 = input.nextInt();
                int result4 = factorial(number4);
                System.out.println(number4 + " factorial adalah " + result4);
                break;
            default:
                System.out.println("Operasi yang dimasukkan tidak valid.");
                break;
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}