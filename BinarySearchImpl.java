package com.gokul.spring.basics.springbasics;

public class BinarySearchImpl {

	
	private SortAlgorithm sortAlgorithm;
	
	
	
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numberToSearch) {
    	
    	int[] sortedNumbers=sortAlgorithm.sort(numbers);
    	System.out.println(sortAlgorithm);
//    sorting an array
//    search the array
//    return the array
        return 3;
    }
}
