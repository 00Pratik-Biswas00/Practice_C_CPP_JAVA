
import java.util.Scanner;
import java.util.Stack;

class InfixToPrefix {

  public static int precedence(char op) {
    switch (op) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
      case '%':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }

  public static String infixToPrefix(String infix) {
    String prefix = "";
    Stack<Character> operators = new Stack<>();

    for (int i = infix.length() - 1; i >= 0; --i) {
      char ch = infix.charAt(i);

      if (precedence(ch) > 0) {
        while (operators.isEmpty() == false && precedence(operators.peek()) > precedence(ch)) {
          prefix += operators.pop();
        }
        operators.push(ch);
      } else if (ch == '(') {

        char x = operators.pop();
        while (x != ')') {
          prefix += x;
          x = operators.pop();
        }

      } else if (ch == ')') {
        operators.push(ch);
      } else {
        prefix += ch;
      }
      // System.out.println(prefix);
    }

    while (!operators.isEmpty()) {
      prefix += operators.pop();
    }

    String reversedPrefix = "";
    for (int i = prefix.length() - 1; i >= 0; i--) {
      reversedPrefix += prefix.charAt(i);
    }
    return reversedPrefix;
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    String infixExpression = n.next();
    String prefixExpression = infixToPrefix(infixExpression);
    System.out.println(prefixExpression);
    n.close();
  }
}