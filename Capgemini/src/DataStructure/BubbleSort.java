import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		

int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
System.out.println("array elements before sort");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
bubbleSort(a);
System.out.println();
System.out.println(".........................");
System.out.println("array elements after sort");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

	}
static void bubbleSort(int a[])
	{
int t=0;

for(int i=0;i<a.length-1;i++)
{
	for(int j=0;j<a.length-i-1;j++)

	if(a[j]>a[j+1])
	{
		t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
	}

}
	
	}

}
