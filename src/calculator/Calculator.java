/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

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
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("1. result = " + equation.getResult());
        }

        double leftDouble = 4.0d;
        double rightDouble = 9.0d;

        MathEquation executeEQ = new MathEquation('d');
        executeEQ.execute(leftDouble, rightDouble);
        System.out.println("2. result = " + executeEQ.getResult());

        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(92.0d, 25.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)
        };
        
        for (CalculateBase calc : calculators) {
            calc.calculate();
             System.out.println("3. result = " + calc.getResult());
           
        }
        
        String[] statements = {
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
        };
        
        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements){
            helper.process(statement);
            System.out.println(helper);
        }
        
    }

}
