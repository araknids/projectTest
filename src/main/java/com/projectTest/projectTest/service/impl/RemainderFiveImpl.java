package com.projectTest.projectTest.service.impl;

import com.projectTest.projectTest.service.Remainder;

public class RemainderFiveImpl implements Remainder {

    private static int divisor = 5;

    @Override
    public void getRemainder(double item) {
        double remainder = item % 5;
        if(remainder == 0){
            System.out.println("com o divisor " + divisor + " o valor " + item + " passou!!!!!");
            return;
        }
        System.out.println("com o divisor " + divisor + " o valor " + item + " NÂO passou!!!!!");
    }
}
