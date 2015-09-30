/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package givens_4_primenumbers;

/**
 *
 * @author agivens
 */
public class Givens_4_PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int a = 1;

        for (i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }

    }
    /*
     method - like a little program
     it can recieve and return values to other methods
     */

    static boolean isEven(int a) {
        return (a % 2 == 0);
    }

    static boolean isOdd(int b) {
        return (b % 2 != 0);
    }

    static boolean isPrime(int c) {
        int divisor = 0;
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                divisor += 1;
            }
        }
        if (divisor > 0) {
            return false;
        } else {
            return true;
        }
        //return (divisor == 0);
    }
}
