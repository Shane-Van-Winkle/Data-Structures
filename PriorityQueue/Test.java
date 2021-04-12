/*
import java.util.*;
public class Test {
public static void main(String[] args) {
PriorityQueue<String> pq = new PriorityQueue<String>();
System.out.println(pq.isEmpty());
pq.enqueuePQ(0,"ZERO");
pq.enqueuePQ(1,"ONE");
pq.enqueuePQ(3, "THREE");
pq.enqueuePQ(2,"TWO");
System.out.println(pq.toString());
System.out.println(pq.dequeuePQ());
System.out.println(pq.peekPQ());
}//end main
}//end class


*/
public class Test
{
	public static void main(String[] args)
	{
		// after the 30 is expected grades
		double mine = (29 + 27 + 29 + /*24*/ 28 + 30 + 50 + 55 +  17 + 19 + 16 + 18 + 17 + 17 + 20 + 18 + 20 + 82 + 81 + 87 + 215);
		
		double pote = (30 + 30 + 30 + 30 + 30 + 60 + 30 + 30 + 20 + 20 + 20 + 20 + 20 + 20 + 20 + 20 + 20 + 100 + 100 + 100 + 250);
		
		double grade = (mine / pote) * 100;
		System.out.println(grade);
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		PriorityQueue<Character> pq3 = new PriorityQueue<Character>();
		/*
		PriorityQueue pq4 = new PriorityQueue();
		pq4.enqueuePQ(2, "F");
		pq4.enqueuePQ(2, 32);
		System.out.println(pq4.toString());
		*/
		
		
		pq3.enqueuePQ(3, 'A');
		pq3.enqueuePQ(3, 'B');
		pq3.enqueuePQ(3, 'C');
		System.out.println(pq3.toString());
		
		System.out.println(pq3.dequeuePQ());
		System.out.println(pq3.peekPQ());
		
		pq2.enqueuePQ(2, "two");
		pq2.enqueuePQ(3, "three");
		pq2.enqueuePQ(1, "one");
		//pq2.enqueuePQ(-2, "neg two");
		//pq2.enqueuePQ(3, "three 2");
		//pq2.enqueuePQ(-2, "neg two 2");
		//pq2.enqueuePQ(1, "one 2");
		System.out.println(pq2.toString());
		
		System.out.println(pq2.dequeuePQ());
		System.out.println(pq2.peekPQ());
		System.out.println(pq2.toString());
		
		System.out.println(pq.isEmpty());
		pq.enqueuePQ(3, "three");
		System.out.println(pq.toString());
		pq.enqueuePQ(5, "five");
		System.out.println(pq.isEmpty());
		System.out.println(pq.toString());
		System.out.println(pq.dequeuePQ());
		System.out.println(pq.isEmpty());
		System.out.println(pq.dequeuePQ());
		
		try
		{
			System.out.println(pq.peekPQ());
		}
		catch (PQException ex)
		{
			System.out.println("PEEK EXCEPTION CAUGHT");
		}
		
		try
		{
			System.out.println(pq.dequeuePQ());
		}
		catch (PQException ex)
		{
			System.out.println("Dequeue EXCEPTION CAUGHT");
			
		}
		
		System.out.println(pq.isEmpty());
		
		
		
		
		System.out.println("DONE");
		
		
		
	}
}
