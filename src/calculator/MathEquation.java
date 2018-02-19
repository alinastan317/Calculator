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
public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public MathEquation() {
    }

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double rightVal, double leftVal) {
        this.rightVal = rightVal;
        this.leftVal = leftVal;
        execute();
    }

    public void execute() {
        switch (getOpCode()) {
            case 'a':
                result = getLeftVal() + getRightVal();
                break;
            case 's':
                result = getLeftVal() - getRightVal();
                break;
            case 'd':
                if (getRightVal() != 0) {
                    result = getLeftVal() / getRightVal();
                } else {
                    result = 0.0d;
                }
                break;
            case 'm':
                result = getLeftVal() * getRightVal();
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }

    /**
     * @return the leftVal
     */
    public double getLeftVal() {
        return leftVal;
    }

    /**
     * @param leftVal the leftVal to set
     */
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    /**
     * @return the rightVal
     */
    public double getRightVal() {
        return rightVal;
    }

    /**
     * @param rightVal the rightVal to set
     */
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    /**
     * @return the opCode
     */
    public char getOpCode() {
        return opCode;
    }

    /**
     * @param opCode the opCode to set
     */
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }
}
