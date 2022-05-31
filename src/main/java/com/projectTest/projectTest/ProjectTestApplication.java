package com.projectTest.projectTest;

import com.projectTest.projectTest.service.Remainder;
import com.projectTest.projectTest.service.impl.RemainderFiveImpl;
import com.projectTest.projectTest.service.impl.RemainderSevenImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectTestApplication {

    @Autowired
    private static Remainder remainderFive = new RemainderFiveImpl();
    @Autowired
    private static Remainder remainderSeven = new RemainderSevenImpl();

    public static void main(String[] args) {
        double[] array = new double[]{4, 10, 46, 5, 25, 36,66,886,4410,6666,445,77,345};
        for (double item : array) {
            remainderFive.getRemainder(item);
            remainderSeven.getRemainder(item);
        }


    }

}
