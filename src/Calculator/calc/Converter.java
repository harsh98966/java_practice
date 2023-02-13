package Calculator.calc;

import java.util.Stack;

public class Converter {
    private StringBuffer result;
    private Stack<Character> stck;
    public Converter(String query){
        stck = new Stack<>();
        result = new StringBuffer("");
        StringBuffer q = new StringBuffer("(");
        q.append(query);
        q.append(')');

        convert(q.toString());
    }

    private boolean isOperator(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    private int get_precedence(char c){
        if (c == '-' || c == '+') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return 0;
    }
    // push all stack elements upto '(' into result string
    private void emptyStack(){
        if(!stck.isEmpty()){
            while (stck.peek() != '(') {
                result.append(stck.peek());
                stck.pop();
            }
            stck.pop();
        }
    }
    private void convert(String query){
        for(int i = 0; i < query.length(); i++){
            char curr = query.charAt(i);
            if (isOperator(curr)) {
                while(!stck.isEmpty() && get_precedence(curr) <= get_precedence(stck.peek())){
                    result.append(stck.peek());
                    stck.pop();
                }
                stck.push(curr);
            }
            else if (curr == '(') {
                stck.push(curr);
            }
            else if (curr == ')'){
                emptyStack();
            }
            else {
                result.append(curr);
            }
        }
        emptyStack();
    }
    public String getResult(){
        return result.toString();
    }

}
