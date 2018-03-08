/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.myapp;

import calculator.calcengine.InvalidStatementException;
import calculator.calcengine.MathEquation;
import calculator.calcengine.Adder;
import calculator.calcengine.CalculateBase;
import calculator.calcengine.CalculateHelper;
import calculator.calcengine.Divider;
import calculator.calcengine.Multiplier;
import calculator.calcengine.Subtracter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alina
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] statements = {
            "add 25.0 92.0",
        };
        
        for (String statement:statements){
        
        }
    }

    
        static void useCalculateHelper() {
            String[] statements = {
            "add 1.0", //incorrect number of values
            "add xx 25.0", //non numeric data 
            "addX 0.0 0.0", //invalid command
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Original exception: " + e.getCause().getMessage());
                }
            }

        }
    }
        
        
        
        //        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];
//
//        MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation('d', 100.0d, 50.0d);
//        equations[1] = new MathEquation('a', 25.0d, 92.0d);
//        equations[2] = new MathEquation('s', 225.0d, 17.0d);
//        equations[3] = new MathEquation('m', 11.0d, 3.0d);
//
//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.println("1. result = " + equation.getResult());
//        }
//
//        double leftDouble = 4.0d;
//        double rightDouble = 9.0d;
//
//        MathEquation executeEQ = new MathEquation('d');
//        executeEQ.execute(leftDouble, rightDouble);
//        System.out.println("2. result = " + executeEQ.getResult());
//
//        CalculateBase[] calculators = {
//            new Divider(100.0d, 50.0d),
//            new Adder(92.0d, 25.0d),
//            new Subtracter(225.0d, 17.0d),
//            new Multiplier(11.0d, 3.0d)
//        };
//
//        for (CalculateBase calc : calculators) {
//            calc.calculate();
//            System.out.println("3. result = " + calc.getResult());
//
//        }
//
////    public void readStatements(String filename) throws IOException {
////        BufferedReader reader = null;
////        try {
////            reader = new BufferedReader(new FileReader(filename));
////            String line = null;
////            while ((line = reader.readLine()) != null) {
////                String[] parts = line.split(" ");
////                for (String statement : parts) {
////                    try {
////                        helper.process(statement);
////                        System.out.println(helper);
////                    } catch (InvalidStatementException e) {
////                        System.out.println(e.getMessage());
////                        if (e.getCause() != null) {
////                            System.out.println("Original exception: " + e.getCause().getMessage());
////                        }
////                    }
////                }
////            }
////        } finally {
////            if (reader != null) {
////                reader.close();
////            }
////        }
////    }
////
////    readStatements("statements.txt");
}
