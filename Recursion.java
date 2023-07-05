public class Main {
    public static void main(String[] args) {
        int n = 9;
        int factorial = productOfNumbers(n);
        System.out.println("factorial of " + n + " = " + factorial);
    }
        public static int productOfNumbers(int n) 
        { 
            if (n >= 1)
            return n * productOfNumbers(n - 1);
            else
            return 1;
    
    }
}
