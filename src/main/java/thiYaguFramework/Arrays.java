package thiYaguFramework;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readarray();
		//readMultiArray();
		//minNumberFromarray();
		//smalestNumber();
		//maxNumberInMinNum();
		swapArray();

	}
	private static String bubblesort() {
		// TODO Auto-generated method stub
		boolean flag = false;
		int[] num = {1,2,5,6,8};
		
				for(int s:num){
					if(s == 7){
						flag = true;
						
					}
					else{
						//do nothing
					}
					
					
					
				}
				System.out.println(flag);
				return flag? "yes" : "no";
			
			}
			
	
	public static void retrnresult(){
		
		System.out.println(bubblesort());
		
		System.out.println();
		
	}
	
	public static void readarray(){
		
		int[] array = {1,2,3,4};
		
		for(int i=0;i<array.length;i++){
			
			System.out.println(array[i]);
		}
		
	}
	
	public static void readMultiArray(){
		int a[][] ={{1,2,3},{6,4,5}};
		//System.out.println(a[1][2]);
		for(int i=0;i<2;i++){
			
			for(int j = 0;j<3;j++){
				System.out.println(a[i][j]);
				
				
			}
			
		}
	}
	
	public static void minNumberFromarray(){
		int abc[][] ={{9,2,3},{6,4,5}};
		int min = abc[0][0];
		for(int i = 0;i<abc.length;i++){
			
			for(int j =0; j<abc.length;j++){
				if(abc[i][j]<min){
					min=abc[i][j];
				}
				
			}
		}
		System.out.println(min);
		
	}

	public static void smalestNumber(){
		
		int abc[]={9,3,4,1,9,3};
		int minnumber =abc[0];
		
		for(int i = 0;i< abc.length;i++){
			
			if(abc[i] < minnumber){
				minnumber=abc[i];
			}
		}
		 System.out.println(minnumber);
	}
	
	public static void maxNumberInMinNum(){
		int abc[][]={{2,5,9},{3,5,7},{3,5,8}};
		int minnumber = abc[0][0];
		int maxnumberinMinCol = abc[0][0];
		int mincolumn = 0;
		
		for(int i = 0;i<abc.length;i++){
			
			for(int j = 0;j<abc.length;j++){
				if(minnumber<abc[i][j]){
					
					minnumber=abc[i][j];
					int row = i;
					mincolumn = j;
					
				}
			}
		}
		int k =0;
		while(abc[k][mincolumn] >maxnumberinMinCol){
			
			maxnumberinMinCol=abc[k][mincolumn];
			System.out.println(maxnumberinMinCol);
			
		}
		
		
	}
	
	public static void swapArray(){
		
		int a[] = {3,1,5,7,9,2,8};
		int temp;
		for(int i =0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					
					//swap
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
