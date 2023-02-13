package Calculator.calc;

import java.util.InputMismatchException;
import java.util.Stack;

public class Calculator {
    private int result;
    private String postfix;

    public Calculator(String query){
        this.postfix = new Converter(query).getResult();
        calculate();
    }

    private boolean isOperator(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    private int getResult(int op1, int op2, char op){
        if(op == '+') return op1 + op2;
        if(op == '-') return op1 - op2;
        if(op == '/') return op1 / op2;
        if(op == '*') return op1 * op2;
        if(op == '^') {
            while(op2 > 1){
                op1 *= op1;
                op2--;
            }
            return op1;
        }
        return 0;
    }
    private void calculate(){
        System.out.println("Calc: " + postfix);
        Stack<Integer> stck = new Stack<>();
        for(int i = 0; i < postfix.length(); i++){
            char curr = postfix.charAt(i);
            if (isOperator(curr)) {
                int op1, op2;
                op2 = stck.peek();
                stck.pop();
                op1 = stck.peek();
                stck.pop();
                stck.push(getResult(op1, op2, curr));
            }
            else {
                StringBuffer test = new StringBuffer(Character.toString(curr));
                stck.push(Integer.parseInt(test.toString()));
            }
        }
        result = stck.peek();
        stck.pop();
    }

    public int getResult() {
        return result;
    }
}
