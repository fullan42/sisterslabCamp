public class homework2 {
    public void hw2() {
        // 1- Fibonacci sayılarını özyinelemeli (recursive) olarak bulma
        System.out.println("Fibonacci(5): " + fibonacci(5));

        // 2- Palindrom kontrolü
        System.out.println("Is 'level' a palindrome? " + isPalindrome("level"));

        // 3- Permutasyon hesaplama
        System.out.println("Permutation(5, 2): " + calculatePermutation(5, 2));

        // 4- Asal sayı kontrolü
        System.out.println("Is 13 prime? " + isPrime(13));

        // 5- Hesap makinesi
        System.out.println("Calculation(5.0 + 3.0): " + calculate(5.0, 3.0, '+'));

        // 6- Ebob ve Ekok
        System.out.println("GCD(24, 36): " + findGCD(24, 36));
        System.out.println("LCM(24, 36): " + findLCM(24, 36));

        // 7- Armstrong sayı kontrolü
        System.out.println("Is 153 an Armstrong number? " + isArmstrong(153));

    }

    // 1- Fibonacci sayılarını özyinelemeli (recursive) olarak bulan metod
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 2- Palindrom kontrolü yapan metod
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 3- Permutasyon hesaplama
    public static int calculatePermutation(int n, int r) {
        if (n < r) {
            return 0;
        } else {
            return factorial(n) / factorial(n - r);
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 4- Girilen sayıyı asal mı kontrol eden metod
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 5- Kendi hesap makinenizi yapma
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
    }

    // 6- Ebob (GCD) hesaplama
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // 7- Ekok (LCM) hesaplama
    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }

    // 8- Armstrong sayı mı kontrol eden metod
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;
        for (; originalNum != 0; originalNum /= 10, ++n) ;

        originalNum = num;
        for (; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        return result == num;
    }
}
