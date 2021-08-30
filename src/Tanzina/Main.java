package Tanzina;
import jdk.jfr.Percentage;

import java.util.*;

//Simple calculator

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("Enter the first number \n");
        a = in.nextDouble();
        System.out.print("Enter second number \n");
        b = in.nextDouble();
        System.out.print("Choose the operation  " +
                "\n1.Addition" +
                "\n2.Subtraction" +
                "\n3.Multiplication" +
                "\n4.Division" +
                "\n#Please enter the number of operation \n");
        double input = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;

        if (input == addition) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);  }
        else if (input == subtraction)  {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);	}
        else if (input == multiplication)	{
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);	}
        else if (input == division)   {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);	}


        }
    }
