public class Main3 {
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;

        // Використання циклу for
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + number + " (for): " + factorial);

        // Використання циклу while
        int i = 1;
        factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал числа " + number + " (while): " + factorial);
    }
}