public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= Double::sum; /* Use a lambda expression to set "res" to the correct function.*/
            break;
            case "-": res= (num1, num2) -> num1 - num2;
            break;
            case "*": res=(num1, num2) -> num1 * num2;
            break;
            case "/": res= (num1, num2) -> num2 == 0.0 ? Double.POSITIVE_INFINITY : num1 / num2;
            break;
            default: res = (num1, num2) -> Double.MIN_VALUE;
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        /* DoMath calc = toOperation(op);  set calc to the correct function calling the method above.*/
        return toOperation(op).compute(n1, n2); /* return the result of calc.compute with the numbers given.*/
    }
}
