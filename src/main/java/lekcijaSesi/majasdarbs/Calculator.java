package lekcijaSesi.majasdarbs;

public class Calculator {
    int result;
    //Method for addition
    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    //Method for subtraction
    public int subtract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    //Method for multiplication
    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    //Method for division
    public float divide(float num1, float num2) {
        float result = num1/num2;
        return result;
    }
    }
