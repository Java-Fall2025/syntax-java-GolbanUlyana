package ua.university;
import java.util.Arrays;

/* 
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /* 
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        return new double[]{sum, average};
    }

    /* 
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /* 
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {  // Fixed: Added || operator
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    /**
     * Returns the day of the week name for a number 1-7.
     * @throws IllegalArgumentException if day is not between 1 and 7
     */
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("Day must be between 1 and 7");
        }
    }

    /**
     * Returns an array counting down from n to 1.
     * @throws IllegalArgumentException if n is less than or equal to 0
     */
    public static int[] countdown(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

    /**
     * Returns factorial of n.
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0 || n == 1) {  // Fixed: Added || operator
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Returns a reversed copy of the array.
     * @throws IllegalArgumentException if arr is null
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /* 
     * Returns sum of all elements in a 2D array (matrix).
     * @throws IllegalArgumentException if matrix is null
     */
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        
        int sum = 0;
        for (int[] row : matrix) {
            if (row != null) {
                for (int num : row) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    /* 
     * Checks if a string is a palindrome.
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /* 
     * Returns minimum and maximum of an array.
     * @throws IllegalArgumentException if arr is null or empty
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return new int[]{min, max};
    }

    /* 
     * Returns multiplication table n x n.
     * @throws IllegalArgumentException if n is less than or equal to 0
     */
    public static int[][] multiplicationTable(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    /* 
     * Returns all even numbers up to n.
     * @throws IllegalArgumentException if n is less than 2
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n must be at least 2");
        }
        
        int count = n / 2;
        int[] evens = new int[count];
        
        for (int i = 0; i < count; i++) {
            evens[i] = (i + 1) * 2;
        }
        return evens;
    }

    /* 
     * Checks if a number is prime.
     * @throws IllegalArgumentException if n is less than 0
     */
    public static boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Counts vowels in a string.
     * @throws IllegalArgumentException if s is null
     */
    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /* 
     * Returns first n Fibonacci numbers.
     * @throws IllegalArgumentException if n is less than or equal to 0
     */
    public static int[] fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n == 1) {
            return new int[]{0};
        }
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /* 
     * Returns the transpose of a 2D array (matrix).
     * @throws IllegalArgumentException if matrix is null, empty, or not rectangular
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
        
        // Check if matrix is rectangular
        int cols = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != cols) {
                throw new IllegalArgumentException("Matrix must be rectangular");
            }
        }
        
        int rows = matrix.length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    /* 
     * Returns a sorted copy of the array in ascending order.
     * @throws IllegalArgumentException if arr is null
     */
    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        return sorted;
    }
}