package queue;
import java.util.*;
public class demo {
	//priority queue
	public static void main(String[] args) {
		
//		PriorityQueue pq=new PriorityQueue();
//		pq.add(100);
//		pq.add(99);
//		pq.add(230);
//		pq.add(110);
//		pq.add(500);
//		System.out.println(pq);
//		
//		System.out.println(pq.peek());//fetch the first element
//		System.out.println(pq.poll());
//		System.out.println(pq);//peeks and removes the first element
//		
		
		ArrayDeque pq=new ArrayDeque();
		pq.add(100);
		pq.add(99);
		pq.add(230);
		pq.add(110);
		pq.add(500);
		System.out.println(pq);
		
		System.out.println(pq.peek());//fetch the first element
		System.out.println(pq.poll());
		System.out.println(pq);//peeks and removes the first element
		
	}

}
