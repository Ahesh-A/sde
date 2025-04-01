import java.util.Stack;

public class SortStack {
  public static void sort(Stack<Integer> stack) {
	if(stack.isEmpty()) {
	  return;
	}

	int temp = stack.pop();
	sort(stack);
	insert(stack, temp);
  }

  public static void insert(Stack<Integer> stack, int temp) {

	if(stack.isEmpty() || temp > stack.peek()) {
	  stack.push(temp);
	} else {
	  int temp1 = stack.pop();
	  insert(stack, temp);
	  stack.push(temp1);
	}
  }
  public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	stack.push(11);
	stack.push(2);
	stack.push(32);
	stack.push(3);
	stack.push(41);
	
	sort(stack);
	System.out.println(stack);
  }
}
