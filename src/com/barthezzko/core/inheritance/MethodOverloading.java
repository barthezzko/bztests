package com.barthezzko.core.inheritance;

import org.junit.Test;

public class MethodOverloading {

    @Test
    public void foolingTheCompiler(){
        average(12.5, -4.78, 39.04);
        average(3.3, 4.4, 5.5);
        //average(6, 10, 14, 20); - ambigous 1 with 3
        //average(); -ambigous

    }

    public static int average(int... ints){
        System.out.println("int");
        int sum = 0;
        for (int i: ints) sum+= i;
        return (ints.length>0) ? sum/ints.length : 0;
    }

    public static double average(double... doubles){
        System.out.println("double");
        double sum = 0;
        for (double i: doubles) sum+= i;
        return sum/doubles.length;
    }

    public static int average(int length, int... ints){
        System.out.println("int");
        int sum = 0;
        for (int i: ints) sum+= i;
        return (ints.length>0) ? sum/length : 0;
    }
}
