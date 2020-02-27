package cse360assign2;

/**
 * @author Chanelle Fernandez
 * Class ID: 332
 * Assignment #: 1
 * Contains the class "SimpleList" which adds, removes, and searches an int array.
 */

public class SimpleList {
	/**
	 * Contains methods of add(int newNumber), remove(int numberToRemove), count(), toString(), 
	 * search(int numToSearch) which performs functions on a simple int[] list.
	 */
	
	private int count;
	private int[] list;
	
	public SimpleList() {
		this.list = new int[10];
		this.count = 0;
	}
	
	/**
	 * Adds a new number at the beginning (index 0) of the list and pushes the other numbers to the rights.
	 * 
	 * @param newNumber number to be added to array. If array is full, 
	 * 					it pushes the last number out of the array.
	 */
	public void add(int newNumber) {
		
		if(count == 0) {
			list[0] = newNumber;
			count++;
		}
		
		else if(count > 0 && count < 10) {
			for(int index = count; index > 0; index--) {
				list[index] = list[index - 1];
			}
			list[0] = newNumber;
			
			if(count != 10) {
				count++;
			}
		}	
	}
	
	/**
	 * Removes a number from the array and shift all numbers, if any, after it to the left one index.
	 * 
	 * @param numberToRemove number that will be removed from array. If it is not 
	 * 						 found, no number is removed. 
	 */
	public void remove(int numberToRemove) {
		
		for(int index = 0; index < count; index++) {
			
			if(list[index] == numberToRemove) {
				
				while(index < count) {
					list[index] = list[index + 1];
					index++;
				}

				count--;
			}
		}
	}
	
	/**
	 * Returns the amount of numbers in the array.
	 * 
	 * @return count of the numbers in the array
	 */
	public int count() {
		return count;
	}
	
	/**
	 * Converts the int array into a String
	 * 
	 * @return string version of the int array
	 */
	public String toString() {
		String stringList = "";
		
		for(int index = 0; index < count - 1; index++) {
			stringList += list[index] + " ";
		}
		
		stringList += list[count - 1];
		return stringList;
	}
	
	/**
	 * Searches for the index of the number being searched.
	 * 
	 * @param numToSearch number that is being searched for in the array.
	 * @return			  index of the number being searched. If number is not found, returns -1.
	 */
	public int search(int numToSearch) {
		int indexOfNum = -1;
		
		for(int index = 0; index < count; index++) {
			if(list[index] == numToSearch) {
				indexOfNum = index;
			}
		}
		
		return indexOfNum;
	}
}

