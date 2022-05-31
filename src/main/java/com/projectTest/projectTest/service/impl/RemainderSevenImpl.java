package com.projectTest.projectTest.service.impl;

import com.projectTest.projectTest.service.Remainder;

public class RemainderSevenImpl implements Remainder {

    private static int divisor = 7;

    @Override
    public void getRemainder(double item) {
        double remainder = item % 7;
        if(remainder == 0){
            System.out.println("com o divisor " + divisor + " o valor " + item + " passou!!!!!");
            return;
        }
        System.out.println("com o divisor " + divisor + "o valor " + item + " NÂO passou!!!!!");
    }
}
