public class Test2{
	public static void main(String args[]){
		
		
		MyArrayList mal = new MyArrayList();
		
		mal.add("ONE");
		mal.add("TWO");
		printArray(mal);
		
		
		System.out.println();
		//mal.remove(0);
		System.out.println(mal.remove(0) + "REMOVED AT 0");
		printArray(mal);
		
		mal.removeAll();
		
		System.out.println("ADDING SECOND ARRAY");
		mal.add("ONE");
		mal.add("TWO");
		mal.add("THREE");
		mal.add("FOUR");
		mal.add("FIVE");
		mal.add("SIX");
		
		printArray(mal);
		
		mal.remove("ONE");
		mal.remove("ONE");
		mal.remove("TWO");
		mal.remove("THREE");
		mal.remove("FOUR");
		mal.remove("FIVE");
		
		System.out.println(mal.size());
		//System.out.println(mal.remove(3) + "REMOVED");
		System.out.println(mal.size());
		printArray(mal);
		
		System.out.println();
		mal.remove("THREE");
		printArray(mal);
		
		System.out.println();
		mal.remove("TWO");
		printArray(mal);
		
		//mal.remove(7);
		printArray(mal);
		
		/*
		mal.add("ONE");
		mal.remove("ONE");
		printArray(mal);
		
		
		//mal.remove(0);
		
		mal.add("ONE");
		mal.add("TWO");
		mal.add("THREE");
		printArray(mal);
		
	//	System.out.println(mal.remove(0));
		mal.remove(0);
	//	mal.remove(1);
	//	mal.remove(2);
		//mal.remove("TWO");
		printArray(mal);
	*/
		
		/*
		System.out.println("BASIC TESTING");
		mal.add("ONE");
		mal.add("TWO");
		mal.add("Three");
		
		System.out.println(mal.size());
		mal.remove("TWO");
		
		printArray(mal);
		mal.removeAll();
		
		System.out.println("ADD VALUE TESTING");
		System.out.println();
		mal.add("ONE");
		printArray(mal);
		
		System.out.println();
		mal.add("TWO");
		printArray(mal);

		
		mal.add("THREE");
		printArray(mal);

		System.out.println(mal.size() + " Size") ;
		mal.add("FOUR");
		printArray(mal);
		System.out.println(mal.size());
		mal.remove("FOUR");
		mal.remove("THREE");
		printArray(mal);
		//System.out.println(mal.remove(3) + " VALUE AT 3");
		
		
		
		mal.add("FIVE");
		printArray(mal);
		
		mal.add("SIX");
		printArray(mal);
		
		System.out.println(mal.size());
		System.out.println(mal.isEmpty());
		mal.removeAll();
		System.out.println(mal.isEmpty());
		System.out.println(mal.size());
		
		
		mal.add("OLD");
		printArray(mal);
		
		System.out.println(mal.remove(0) + " REMOVED");
		
		mal.remove("NEW");
		printArray(mal);

		
		
		mal.add("NEW");
		printArray(mal);
		System.out.println(mal.get(0) + "GET TEST");
		
		
		System.out.println(mal.remove(0));
		//System.out.println(mal.remove(0));
		System.out.println(mal.size());
		
		*/
		
		/*
		mal.remove(0);
		mal.remove(0);
		mal.remove(0);
		mal.remove(0);
		*/
		
		
		
		
	}
	
	
	public static void printArray(MyArrayList malm){
				for(int i = 0; i < malm.size(); i++){
				System.out.println(malm.get(i));
			}
			System.out.println();
	}	
}