public class basics_of_java {
    public static void main(String args[])
    {
        // This is a single-line comment
        System.out.println("Hello, World!"); // Print a message to the console

        /*
         * This is a multi-line comment
         * It can span multiple lines
         */
        System.out.println("Welcome to Java programming!"); // Another print statement

        int number = 10; // Declare an integer variable
        System.out.println("The number is: " + number); // Print the value of the variable

        // for double and float types, we use 'd' and 'f' suffixes respectively
        double decimalNumber = 5.5d; // Declare a double variable
        float floatNumber = 3.14f; // Declare a float variable

        // Variables
        int age = 25; // integer variable
        String name = "Alice"; // string variable
        boolean isStudent = true; // boolean variable

        // Operators
        int sum = number + age; // Addition operator
        int product = number * 2; // Multiplication operator
        int remainder = number % 3; // Modulus operator
        boolean isEqual = (number == age); // Equality operator

        // Conditionals
        if (age > 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }

        // Loops
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("While loop count: " + count);
            count++;
        }

        // Do-while loop
        int doCount = 0;
        do {
            System.out.println("Do-while loop count: " + doCount);
            doCount++;
        } while (doCount < 2);

        // Print vs Println
        // System.out.print prints text without moving to a new line
        System.out.print("This is printed using print. ");
        System.out.print("See, this is on the same line. ");

        // System.out.println prints text and moves to a new line
        System.out.println("This is printed using println.");
        System.out.println("This will appear on a new line.");
    }
}
