import java.util.Stack;
public class ReverseStack {
  public static void completelyPopAndPutNumber(Stack<Integer> stack, int temp) {
	if(stack.isEmpty()) {
	  stack.push(temp);
	} else {
	  int temp1 = stack.pop();
	  completelyPopAndPutNumber(stack, temp);
	  stack.push(temp1);
	}
  }
  public static void reverse(Stack<Integer> stack) {
	if(stack.isEmpty()) {
	  return;
	}
	int temp = stack.pop();
	reverse(stack);
	completelyPopAndPutNumber(stack, temp);
  }
  public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	stack.push(3);
	stack.push(2);
	stack.push(1);
	stack.push(7);
	stack.push(6);

	reverse(stack);
	System.out.println(stack);
  }
}
