// Shane Van Winkle
// CSC 302.001
// 17-October-2019
// Priority Queue

public class PriorityQueue<T> implements PQInterface<T>
{
	
	private Node<T> front;
	
	//constructor
	public PriorityQueue()
	{
		this.front = null;
	}// end constructor
	//O(1)
	@Override
	public boolean isEmpty()
	{
        //-------------------------------------------------------------------
        // Returns whether or not the priority queue has a node.
        // Precondition: A priority queue object that may or may not have a node.
        // Postcondition: returns true or false
        //------------------------------------------------------------------		
		return this.front == null;
	}// end isEmpty
	
	// This site helped me with the enqueue method.
	//https://www.geeksforgeeks.org/priority-queue-using-linked-list/
	//O(n): while enqueuePQ can go through in constant time, the
	// Worst case scenario is however many
	//nodes are in the linked list.
	@Override
	public void enqueuePQ(int priority, T item)
	{
        //-------------------------------------------------------------------
        // Enqueues A node into the priority queue based on the node's priority.
        // Precondition: A priority queue object that may or may not have a node.
        // Postcondition: a new node has been added to the priority queue.
        //------------------------------------------------------------------		
		Node<T> previous = this.front;
		Node<T> newNode = new Node<T>(priority, item, this.front);	//first newNode references nothing, 
																	//then newNode references the beginning of the priority queue.
		
		if(this.isEmpty())
			this.front = newNode;
		else
		{
			// check if the newNode has the highest priority (Lower number).
			// if a duplicate is met, place it in front of the previous.
			if(newNode.getPriority() < this.front.getPriority())
				this.front = newNode;
			else
			{
				// There isn't a set number of items to go through like with using
				// an index.
				// No size variable either.
				// Have to go by checking if the next is not null and checking the 
				// priority; a while loop.
				// if a duplicate is met, place it behind the previous one added (FIFO).
				// multiple queues in the same queue based on if they have the same priority.
				while(previous.getNext() != null &&
				(previous.getNext().getPriority() <= newNode.getPriority()))
					previous = previous.getNext();
				
				
				newNode.setNext(previous.getNext());//the next node in the constructor is thrown out in favor of previous' next node(current).
				previous.setNext(newNode);
			}// end else
		}// end else
	}// end enqueuePQ

	//O(1): dequeuePQ is done in constant time
	@Override
	public T dequeuePQ() throws PQException
	{
        //-------------------------------------------------------------------
        // Removes the item with the highest priority.
        // Precondition: A priority queue object that may or may not have a node.
        // Postcondition: the node with the highest priority has been removed and 
		// the item it was holding was returned
        //------------------------------------------------------------------		
		if(this.isEmpty())
			throw new PQException("Error: Can't dequeue from an empty priority queue.");
		//the highest priority should just be at the front.
		T temp = this.front.getItem();
		this.front = this.front.getNext();
		return temp;	
			
	}// end dequeuePQ
	//O(1): peekPQ is done in constant time.
	@Override
	public T peekPQ() throws PQException
	{
		//-------------------------------------------------------------------
        // returns the item with the highest priority 
        // Precondition: A priority queue object that may or may not have a node.
        // Postcondition: the node with the highest priority has been returned
        //------------------------------------------------------------------
		if(this.isEmpty())
			throw new PQException("Error: Can't peek at an empty priority queue.");
		return this.front.getItem();
	}
	//O(1): toString is done in constant time.
	@Override
	public String toString()
	{
		//-------------------------------------------------------------------
        // Removes the item with the highest priority.
        // Precondition: A priority queue object that may or may not have a node.
        // Postcondition: the priority queue object is returned as a String.
        //------------------------------------------------------------------
		if(this.front != null)
		{
			return this.front.toString();
		}
		else
		{
			return "";
		}
	}
	
}
