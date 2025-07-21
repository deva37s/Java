public class Day_1 {
    public static void main(String args[])
    {
        //Topics: Print, Variables, Data types, Type conversion and casting, Operators, Conditional Statements, Loops


        //1.Print Statement
            System.out.print("Hello World");    //print and stay in same line 
            System.out.println("Hii Java");     //print and goes to next line
            System.out.println("it'll be shown to next line");

        // 2. Variables
        // Java is a strongly typed language so we have to tell the compiler the data type of the variable we are using 
        int var_1 = 34;

        // 3. Data Types
        // Java has 2 data types:
            //   a. Primitive Data types:
            byte var_b = 10;
            short var_s = 10;
            int var_i = 10;
            long var_l = 10L;     // for long we use 'l' or 'L' suffix

            float var_f = 13.4f;  // for float we use 'f' or 'F' suffix
            double var_d = 43.2;

            boolean var_bool = true;
            char var_c = 'A';

            //   b. Non-primitive Data types:
            // String, Array, Class, Object

        // 4. Type Conversion and Casting
        int a = 345;
        byte b;
        b = (byte)a;
        // When casting int to byte, only the lowest 8 bits are kept.
        // For a=345: 345 % 256 = 89, so b=89
        System.out.println(b); // Output: 89

        int a1 = -130;
        byte d;
        d = (byte)a1;
        System.out.println(d); // Output: -130 + 256 = 126 (wraps around)

        // Type promotion example
        byte b1 = 10;
        short s = 20;
        char c = 'A';
        int i = 30;
        int result = b1 + s + c + i;
        System.out.println(result); // Output: 10+20+65+30=125

        // 5. Operators
        // Arithmetic Operators: +, -, *, /, %
        int num = 10, num_1 = 3;
        System.out.println(num + num_1); // 13
        System.out.println(num % num_1); // 1

        // Assignment Operators: =,+=,-=
        // num = num + 5;
        // num += 5;

        // Unary Operators: ++, --, !
        System.out.println(num++);      // Output: 10, then num becomes 11
        System.out.println(num--);      // Output: 11, then num becomes 10
        System.out.println(++num);      // Output: 11
        System.out.println(--num);      // Output: 10

        boolean flag = false;
        System.out.println(!flag); // true

        // Relational Operators: <, >, <=, >=, ==, !=
        System.out.println(num == num_1);     // false
        System.out.println(num != num_1);     // true

        // Logical Operators: &&, ||, !
        System.out.println((num > 0) && (num_1 < 30));    // true

        // 6. Conditional Statements
        // if-else
        /*
        if (condition) {
            // If condition is true
        } else {
            // If condition is false
        }
        */

        // if-else-if-else
        /*
        if (condition) {
            // If condition is true
        } else if (condition2) {
            // If condition2 is true
        } else {
            // If both are false
        }
        */

        // Ternary operator
        int x = 10;
        int result_1 = x > 5 ? 20 : 5;
        System.out.println(result_1); // 20

        // Switch statement
        int age = 3;
        switch (age) {
            case 18:
                System.out.println("He/she can vote now");
                break;
            default:
                // No action
        }

        // 7. Loops
        // while loop
        int value = 0;
        while (value <= 4) {
            System.out.print(value + " ");
            value++;
        }
        // Output: 0 1 2 3 4 

        // do-while loop
        /*
        do {
            // run the instruction while the condition is true
            // changing condition
        } while (condition);
        */

        // for loop
        /*
        for (initialization; condition; increment) {
            // instruction to run
        }
        */
    }
}
    