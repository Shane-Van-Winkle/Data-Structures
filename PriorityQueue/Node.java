public class Node<T>
{
		private int itemPriority;
		private T item;
		private Node<T> next;
		
		
		public Node(int priority, T newItem)
		{
			this.itemPriority = priority;
			this.item = newItem;
			this.next = null;
		}
		
		public Node(int priority, T newItem, Node<T> nextNode)
		{
			this.itemPriority = priority;
			this.item = newItem;
			this.next = nextNode;
		}
		
		public int getPriority()
		{
			return this.itemPriority;
		}
		
		public T getItem()
		{
			return this.item;
		}
		
		public Node<T> getNext()
		{
			return this.next;
		}
		
		public void setNext(Node<T> nextNode)
		{
			this.next = nextNode;
		}
		
		@Override
		public String toString()
		{
			String s = "(" + this.itemPriority + ", " + this.item;
			if(this.next == null)
				return s + ", null)";
			else
				return s + ", " + this.next.toString() + ")";
		}	
}
