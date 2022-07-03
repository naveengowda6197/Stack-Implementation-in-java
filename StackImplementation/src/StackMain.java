import java.security.KeyStore.Entry;
import java.util.*;
public class StackMain {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.printStatck();
		Stack stack2=new Stack();
		stack2.push(11);
		stack2.push(21);
		stack2.pop();
		stack2.push(41);
		stack2.push(51);
		stack2.pop();
		stack2.printStatck();
		/*HashMap<Integer, Integer> list=new HashMap<Integer, Integer>();
		list.put(1, 1);
		for(Map.Entry<Integer, Integer> i:list.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}*/
 	}

}
