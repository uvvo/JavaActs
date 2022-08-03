import lang.stride.*;

/**
 * 
 */
public class ArithmeticOperators
{

    /* Use any 2 numbers for the Arithmetic operators print output*/

    /**
     * 
     */
    static public void main(String[] args)
    {
        int num1 = 30;
        int num2 = 20;
        int x = 10;
        int y = 5;
        System.out.println("Variable values...");
        System.out.println(" num1 = " + num1);
        System.out.println(" num2 = " + num2);
        /* Adding*/
        System.out.println("Adding");
        System.out.println(" num1 + num2 = " + (num1 + num2));
        /* subtracting*/
        System.out.println("Subtracting");
        System.out.println(" num1 - num2 = " + (num1 - num2));
        /* multiplying*/
        System.out.println("Multiplying");
        System.out.println(" num1 * num2 = " + (num1 * num2));
        /* dividing*/
        System.out.println("Dividing");
        System.out.println(" num1 / num2 = " + (num1 / num2));
        /* Modulus*/
        System.out.println("Modulus");
        System.out.println(" num1 % num2= " + (num1 % num2));
        /* Increment*/
        System.out.println("Increment");
        /* Unsupported feature in Stride : ++/-- in expression*/
        System.out.println(" int x= 10 " + ( +  + x));
        /* Decrement*/
        System.out.println("Decrement");
        /* Unsupported feature in Stride : ++/-- in expression*/
        System.out.println(" int x= 5 " + ( -  - y));
    }
}
