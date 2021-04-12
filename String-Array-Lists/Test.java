public class Test{
	public static void main(String args[]){
		
		//BASICS STUFF
		System.out.println("BASICS");
		MyArrayList mal = new MyArrayList();
		System.out.println(" PRINT 'ONE' TO 'SIX'");
		mal.add("ONE");
		mal.add("TWO");
		mal.add("THREE");
		mal.add("FOUR");
		mal.add("FIVE");
		mal.add("SIX");
		
		printArray(mal);
		
		
		
		System.out.println();
		System.out.println(mal.remove(2) + "REMOVED AT 2");
		//mal.remove("THREE");
		//mal.remove("THREE");
		printArray(mal);
		mal.add("seven");
		printArray(mal);
		System.out.println(mal.size());
		mal.removeAll();
		
		//START COMPLEX
		System.out.println("COMPLEX");
		System.out.println(mal.isEmpty());
		
		mal.add("ONE");
		mal.remove("ONE");
		printArray(mal);
		System.out.println(mal.isEmpty());
		
		System.out.println(mal.remove(0));
		System.out.println(mal.isEmpty());
		
		mal.add("ONE");
		mal.add("TWO");
		mal.add("THREE");
		printArray(mal);
		
		System.out.println(mal.remove(2) + "STRING AT 2");
		//mal.remove(0);
	//	mal.remove(1);
	//	mal.remove(2);
		mal.remove("ONE");
		printArray(mal);
		System.out.println(mal.size());
		mal.remove(0);
		mal.remove(0);
		printArray(mal);
		System.out.println(mal.size());
		mal.remove(0);
		System.out.println(mal.size());
		
	
		
		
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
		
		
		
		
		mal.remove(0);
		mal.remove(0);
		mal.remove(0);
		mal.remove(0);
		
		
		
		
		
	}
	
	
	public static void printArray(MyArrayList malm){
				for(int i = 0; i < malm.size(); i++){
				System.out.println(malm.get(i));
			}
			System.out.println();
	}	
}