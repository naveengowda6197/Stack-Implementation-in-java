
import java.util.*;

public class Stack {
	int top;
	List<Integer> list=new ArrayList<>();
	public Stack() {
		this.top=-1;
	}
	
	public void push(Integer data) {
		this.top++;
		this.list.add(data);
	}
	
	public Integer pop() {
		Integer element=this.list.get(this.top);
		this.list.remove(this.top);
		--this.top;
		return element;
	}
	
	public void printStatck() {
		System.out.println("Stack elements are:\n");
		for(int i=0;i<=this.top;i++) {
			System.out.println(list.get(i));
		}
	}
}
