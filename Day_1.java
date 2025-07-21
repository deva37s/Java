public class Day_1 {
    public static void main(String args[])
    {
        //Topics: Print, Variables, Data types, Type conversion and casting, Operators


        //To print sth in java
            System.out.print("Hello World");    //print and stay in same line 
            System.out.println("Hii Java");     //print and goes to next line
            System.out.println("it'll be shown to next line");

        //Variables in Java
        //Java is a strongly typed language so we have to tell the compiler, the data type of the variable we are using 

            int var_1=34;

        //Data Types in Java 
        //Java has 2 data types:
            //Primitive Data types:
                //Integer
                byte var_b=10;
                short var_s=10;
                int var_i=10;
                long var_l=10L;     //for long we use 'l' or 'L' suffix

                //Float
                float var_f=13.4f;  //for float we use 'f' or 'F' suffix
                double var_d=43.2;

                //boolean
                boolean var_bool=true;

                //Char
                char var_c='A';

            //Non-primitive
                //String
                //Array
                //Class
                //Object


        //Type conversion and casting 

            int a=345;
            byte b;
            b=(byte)a;
            //Here b will be find by modulas operator(%) as dividing 345(a) with 256(the range of byte), so b=345 % 256 which is 89
            System.out.println(b); // Output: 89

            int a1=-130;
            byte d;
            d=(byte)a1;
            System.out.println(d);

        //Type promotion
            byte b1=10;
            short s=20;
            char c='A';
            int i=30;
            int result=b1+s+c+i;
            System.out.println(result); //Output: 10+20+65+30=125

        //Operators 
            //Arithmetic Operator(+, -, *, /(Division), %(Modulas))
                int num=10, num_1=3;
                System.out.println(num + num_1); // 13
                System.out.println(num % num_1); // 1      Modulas operator (%) is used to calculate remainder

                // num=num+5;
                // num+=5;      //Both will do the same work, add 5 to the num variable 
                

            //Unary (++, --, !)
                // Increment/Decrement Operator:
                    //Post Increment/decrement: It fetch first then increment/decrement the value 
                        System.out.println(num++);      // Output: 30, becoz it'll be incremented after fetching the value
                        System.out.println(num--);      // Output: 31, becoz it'll be decremented after fetching the value
                    
                    //Pre-Increment: It increment/decrement the value first then fetch the value
                        System.out.println(++num);      //Output: 31, becoz it'll incremented first then fetch the value to print
                        System.out.println(--num);      //Output: 30, becoz it'll decremented first then fetch the value to print

                //Logical Not (!)
                    boolean flag = false;
                    System.out.println(!flag); // true

            //Relational operator (<, >, <=, >=, ==, !=): It does return true/false 
                System.out.println(num==num_1);     //check if values are equal
                System.out.println(num!=num_1);     //check if values are not equal
                
            //Logical operators (&& , ||, !): Return boolean value
            System.out.println((num > 0) && (num_1 < 30));    // True && True= True 
                //num=10, num_1=3
        
        //Contional Statement: if-else, if-else_if-else, ternary operator 
            // If-else
                /*
                if(condition)
                {
                    If condition is true
                }
                else 
                {
                    if condition is false
                }*/

            //If-else_if-else
                /*if(condition)
                {
                    //If condition is true
                }
                else if(condition 2)
                {
                    //if condition 2 is true
                }
                else
                {
                    if both are false
                }*/

            //Ternary operator 
                // condition ? (If condition is true) : (If condition is false)
                int x = 10;
                int result_1=x>5?20:5;
                System.out.println(result_1); //20, becoz condition is true
            
            //Switch operator
                // switch (args) {
                //     case value:
                        
                //         break;
                
                //     default:
                //         break;
                // }
                int age=3;
                switch (age) {
                    case 18:
                        System.out.println("He/she can vote now");
                        break;
                
                    default:
                        
                }
        //Loops: while, do-while, for
        //Loops are used to do something repeatively 
            //while
                // while (condition) {
                //    run the instrction while flag is true
                //    incrementing
                // }
                int value=0;
                while(value<=4)
                {
                    System.out.print(value+" ");
                    value++;
                }
                //Output: 0 1 2 3 4 
            
            //do-while
                // do {
                //     run the instruction while the condition is true
                //     changing condition
                // } while (condition);

            //for
                // for (initialization; condition; increment) {
                //     instruction to run
                // }
                


    }
}
