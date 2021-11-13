package Generics;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
Integer arr[]= {1,4,3,6,2,7};
Mygeneric<Integer> ma=new Mygeneric<Integer>(arr);
Integer[] arr2=ma.getArr();
for(Integer s:arr2)
System.out.println(s);

Integer[] arr3=ma.swapElement(arr);

for(Integer s1:arr3)
System.out.println(arr3);


	}

}
class Mygeneric<T>
{
	private T[] arr;

	public Mygeneric(T[] arr) {
		super();
		this.arr = arr;
	}

	public <E> Integer[] swapElement(Integer[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[0];
			 arr[0]=arr[1];
			 arr[1]=temp;
			 
		}
		return arr;
		
		
	}

	public T[] getArr() {
		return arr;
	}

	@Override
	public String toString() {
		return "Mygeneric [arr=" + Arrays.toString(arr) + ", getArr()=" + Arrays.toString(getArr()) + "]";
	}
	
	

	
	}
	
