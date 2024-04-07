import java.util.Random;

public class ArrayOperations {

    // Programmer identifying comments
    // Author: [Carmelina Jaramillo]
    // Date: [4/7/2024]

    private int[] test;

    //A method called, fillArray
    public void fillArray() {
        Random random = new Random();
        //For loop
        for (int i = 0; i < test.length; i++) {
            //Integers between 1 and 10 inclusive
            test[i] = random.nextInt(10) + 1;
        }
    }

    //A method called, returnOne
    public int returnOne(int index) {
        //That returns
        return test[index];
    }

    //A method called, printEven
    public void printEven() {
        System.out.println("Even numbers in the array:");
        //Using a For Loop
        for (int num : test) {
            //Checking if even or not
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //A method called, sumElements
    public void sumElements() {
        int sum = 0;
        //Using a For Loop
        for (int num : test) {
            sum += num;
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }

    //A method called, reverse
    public void reverse() {
        System.out.println("Array elements in reverse order:");
        for (int i = test.length - 1; i >= 0; i--) {
            System.out.print(test[i] + " ");
        }
        //Print the contents
        System.out.println();
    }
}