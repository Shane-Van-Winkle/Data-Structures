// java version 1.8.1
// Shane Van Winkle
// csc302.001
// 17-September-2019
// This creates the MyArrayList object


import java.io.*;
import java.util.*;

public class MyArrayList {
	
	//java variables can't start with a number so 1stArray is now a lstArray (I changed the'1' 
	//into an 'l'.
	
	// private attributes.
	private String[] lstArray;
	private int size;
	
	// MyArrayList Constructor
	public MyArrayList(){
		this.lstArray = new String[2];
		this.size = 0;
	}// end MyArrayList Constructor
	
	//isEmpty returns true if the size is zero.
	public boolean isEmpty(){
		if(this.size == 0){
			return true;
		}// end if
		else{
			return false;
		}// end else
	}// end isEmpty

	public int size(){
		return this.size;
	}// end size
	
	// add appends the String item to the lstArray
	// increase the array as soon as the size is equal to the length of the array.
	public void add(String item){	
		lstArray[size] = item;
		this.size++;
		
		// checks at the end otherwise  if we try to remove anything when the array is full.
		// the method will try to grab something to the right of the end which will call an 
		// IndexOutOfBoundsException.
		// we cannot wait until the we need to add another item to boost lstArray.
		if(size == lstArray.length){
			String[] tempArray = new String[(lstArray.length)* 2];
			System.arraycopy(lstArray, 0, tempArray, 0, size);
			lstArray = tempArray;
		}// end if
		
	}// end add
	
	
	//remove removes an item specified at an integer index. returns the string that was removed.
	public String remove(int index) throws MyArrayListException{
		String tempString = lstArray[index];
		if(size == 0){//makes sure that size can't go negative.
			removeAll();
			return "";
		}// end if		
			//checks the input index if it's valid.
			if((index < 0) || (index >= this.size) || size < 0){
			throw new MyArrayListException("Error: bad index: " + index);
			}// end if
			else{
				// start the checks.
				//first removes half of the array if it needs to.
				if(size == ((lstArray.length) / 4)){
					String[] b = new String[(lstArray.length) / 2];
					System.arraycopy(lstArray, 0, b, 0, size);
					lstArray = b;
				}// end if
				// the recursive call has reached the "base case" which is the edge.
				// all of the items are shifted left so decrease the size and return the 
				//temp String. and ignore the item at end.
				if(index == this.size - 1){
				--size;
				return tempString;
				}// end if
				//recursive call that shifts numbers until it reaches the end.
				else{
					lstArray[index] = lstArray[index + 1];
					remove(index + 1);
				}// end else
			}// end else
	return tempString;
	}// end remove (At index);
	
	//remove removes a string from lstArray using iteration
	public void remove(String item){
		//removes half of the lstArray if needed.
		if(size ==((this.lstArray.length / 4))){
			String[] tempArray = new String[(lstArray.length) / 2];
			System.arraycopy(this.lstArray, 0, tempArray, 0, this.size);
			this.lstArray = tempArray;
			}// end if			
		
		// goes through the lstArray until it finds a match, then shifts it and decreases the
		//size at the end
		for(int i = 0; i < this.size; i++){
			//check the array for the string.
			if(this.lstArray[i].equals(item)){
				for(int j = i; j < this.size; j++){
					lstArray[j] = lstArray[j + 1];
				}// end for
					size--;
			}// end if
		}// end for		
	}// end remove (at String)
	
	// removeAll resets the array back to the default conditions.
	public void removeAll(){
		this.lstArray = new String[2];
		this.size = 0;
	}// end removeAll
	
	// get returns a value at an index and throws a 
	public String get(int index)throws MyArrayListException{
		if((index < 0) || (index >= this.size)){
			throw new MyArrayListException("Error: Invalid index: " + index + "!");
		}// end if
		else{
			return lstArray[index];
		}// end else
	}// end get
	
	
} // End class MyArrayList
