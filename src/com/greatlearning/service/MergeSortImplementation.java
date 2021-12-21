package com.greatlearning.service;

public class MergeSortImplementation {
	public static void merge(double array[],int left,int mid, int right) {
		
		//Declaring the variables to divide the array into two equal parts 
		int len1 = mid-left + 1;
		int len2 = right-mid;
		
		double leftArr[] = new double[len1];
		double rightArr[] = new double[len2];
		
		//Arranging the values in left array
		for(int i=0;i<len1;i++) {
			leftArr[i]=array[left+i];
			
		}
		
		//Arranging the values in right array
		for(int j=0;j<len2;j++) {
			rightArr[j]=array[mid+1+j];
			
		}
		
		//Declaring variables for swapping the values
		int i,j,k;
		i=0;
		j=0;
		k = left;
		
		//Moving through the left and right array
		while(i<len1 && j <len2) {
			if(leftArr[i]<=rightArr[j]) {
				array[k]= leftArr[i];
				i++;
				}
			else {
				array[k]= rightArr[j];
				j++;
				}
			k++;
			}
		
		//Looping through the left array
		while(i<len1) {
			array[k]= leftArr[i];
			i++;
			k++;
			
		}
		
		//Looping through the right array
		while(j<len2) {
			array[k]= rightArr[j];
			j++;
			k++;
			
		}
	}

	public static void mergesort(double array[],int left, int right) {
		if(left<right) {
			//Declaring the mid variable
			int mid = (left+right)/2;
			
			//Recursion
			mergesort(array,left,mid);
			mergesort(array,mid+1,right);
			
			//Calling the merge function
			merge(array,left,mid,right);
		}
	}



}
