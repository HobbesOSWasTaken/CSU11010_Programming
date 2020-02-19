/* SELF ASSESSMENT
   1.   createSequence:
        Did I use the correct method definition?
            Mark out of 5: 5
            Comment: It takes a positive integer N (whose value is at least 2) and which returns an array.
        Did I create an array of size n (passed as the parameter) and initialise it?
            Mark out of 5: 5
            Comment: I created a 2D array of size n - 1 so that it would fit all numbers from 2 to N and the second dimension was for recording crossed out numbers
        Did I return the correct item?
            Mark out of 5: 5
            Comment: It returns the 2D resulting array
   2.   crossOutMultiples
        Did I use the correct method definition?
            Mark out of 5: 5
            Comment: It takes an array called numbers (which can contain both crossed out and non-crossed out numbers) and a number n to cross out the multiples of.
        Did I ensure the parameters are not null and one of them is a valid index into the array
            Mark out of 2: 2
            Comment: I know because of my previous error handling in other methods that the parameters will never be null but nonetheless I did check.
        Did I loop through the array using the correct multiple?
            Mark out of 5: 5
            Comment: It loops through multiples of the parameter n
        Did I cross out correct items in the array that were not already crossed out?
            Mark out of 3: 3
            Comment: It crosses out all multiples of n except n itself
   3.   sieve
        Did I have the correct function definition?
            Mark out of 5: 5
            Comment: It takes a positive int n that is 2 or greater and returns an array of ints.
        Did I make calls to other methods?
            Mark out of 5: 5
            Comment: I called the createSequence() and crossOutHigherMultiples() methods.
        Did I return an array with all non-prime numbers are crossed out?
            Mark out of 2: 2
            Comment: I returned a 2D array with non prime numbers having a 1 in the second row and prime having a 0
   4.   sequenceTostring
        Did I have the correct function definition?
            Mark out of 5: 5
            Comment: It takes in a sequence of numbers and returns a String.
        Did I ensure the parameter to be used is not null?
            Mark out of 3: 3
            Comment: Previous error handling ensures it is not null but there is still a check for if the array is null
        Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets?
            Mark out of 10: 10
            Comment: I did by checking the second row of each to see if they were a 1 (crossed out) or a 0 (not crossed out)
   5.   nonCrossedOutSubseqToString
        Did I have the correct function definition
            Mark out of 5: 5
            Comment: It takes a sequence and returns an array
        Did I ensure the parameter to be used is not null?
            Mark out of 3: 3
            Comment: Previous error handling ensures it is not null but there is still a check for if the array is null
        Did I loop through the array updating the String variable with just the non-crossed out numbers?
            Mark out of 5: 5
            Comment: I did by checking for a 1 in the second row of the 2d array at each position
   6.   main
        Did I ask  the user for input n and handles input errors?
            Mark out of 5: 5
            Comments: If the user inputs a number less than 2 or if they do not enter an integer it prints an error.
        Did I make calls to other methods (at least one)?
            Mark out of 5: 5
            Comment: I made a call to the sieve method and the sequence to string methods to print out the result.
        Did I print the output as shown in the question?
            Mark out of 5: 5
            Comment: I used the sequence to string functions to do so.
   7.   Overall
        Is my code indented correctly?
            Mark out of 4: 4
            Comments: All code is indented correctly apart from comments
        Do my variable names make sense?
            Mark out of 4: 3
            Comments: The only one that might not have was the "n" variables but I felt these matched well with the large N in the question.
        Do my variable names, method names and class name follow the Java coding standard
            Mark out of 4: 4
            Comments: I used lowerCamelCase where possible aswell as lowercase for variables. No constants were used
      Total Mark out of 100 (Add all the previous marks):
*/

import java.util.Scanner;

public class Lab_Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer >= 2: ");
        int number = -1;
        try {
            number = scanner.nextInt();   
        } catch(Exception e) {
            System.out.println("[ERROR] Invalid input");
        }
        
        if((number < 2) && (number != -1)) {
            System.out.print("[ERROR] Number must be 2 or greater");
        }
        else if(number != -1){
            int[][] result = sieve(number);
            System.out.println(sequenceToString(result));
            System.out.println("Primes: " + nonCrossedOutSubseqToString(result));
        }
    }

    public static int[][] createSequence(int n) {
        if(n < 2) {
            return null;
        }
        else {
            int value = 2;
            int numbers[][] = new int[n - 1][2];
            for(int index = 0; index < numbers.length; index++) {
                numbers[index][0] = value;
                numbers[index][1] = 0;
                value++;
            }
            return numbers;
        }
    }

    public static void crossOutHigherMultiples(int[][] numbers, int n) {
        if(numbers != null) {
            for(int index = 0; index < numbers.length; index++) {
                if((numbers[index][0] != n) && (numbers[index][0] % n == 0)) {
                    numbers[index][1] = 1;
                }
            }
        }
    }

    public static int[][] sieve(int n) {
        if(n < 2) {
            return null;
        }
        int[][] numbers = createSequence(n);
        System.out.println(sequenceToString(numbers));
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index][1] != 1) {
                if(numbers[index][0] < (int)Math.sqrt(n)) {
                    crossOutHigherMultiples(numbers, numbers[index][0]);
                    System.out.println(sequenceToString(numbers));
                }
            }
        }
        return numbers;
    }

    public static String sequenceToString(int[][] numbers) {
        String result = "";
        if(numbers != null) {
            for(int index = 0; index < numbers.length; index++) {
                if(numbers[index][1] == 0) {
                    if(index == numbers.length - 1) {
                        result += numbers[index][0] + "";
                    }
                    else {
                        result += numbers[index][0] + ", ";
                    }

                }
                if(numbers[index][1] == 1) {
                    if(index == numbers.length - 1) {
                        result += "[" + numbers[index][0] + "] ";
                    }
                    else {
                        result += "[" + numbers[index][0] + "], ";
                    }
                }
            }
        }
        return result;
    }

    public static String nonCrossedOutSubseqToString(int[][] numbers) {
        String result = "";
        int primeCount = 0;
        if(numbers != null) {
            for(int index = 0; index < numbers.length; index++) {
                if(numbers[index][1] == 0) {
                    primeCount = index;
                }
            }
            for(int index = 0; index < numbers.length; index++) {
                if(numbers[index][1] == 0) {
                    if(index == primeCount) {
                        result += numbers[index][0];
                    } else {
                        result += numbers[index][0] + ", ";
                    }
                }
            }
        }
        return result;
    }
}
