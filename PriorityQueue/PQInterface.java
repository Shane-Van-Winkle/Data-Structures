public interface PQInterface<T> {

	// Determines whether the priority queue is empty.
	public boolean isEmpty();
	
	// Adds an item to the priority queue.
	public void enqueuePQ(int priority, T item);
	
	// Removes the highest priority item from the
	// priority queue and returns it to the caller.
	public T dequeuePQ() throws PQException;
	
	// Retrieves the highest priority item from the 
	// priority queue and returns it to the caller
	// without removing it from the priority queue.
	public T peekPQ() throws PQException;
	
	// Displays the contents of the priority queue
	// as a string.
	public String toString();
	
}
