package assignment_java_programs;

public class HighestNumberInArray {

	public static void main(String[] args) {
		int arr[]=new int[20];
		int arr1[]= {1,2,3,4};
		int j,k;
		int large=arr1[1];
		for(int i=1;i<arr1.length;i++)
		{	
				if(arr1[i]>large)
				{
					large=arr1[i];
					//k=i;
				}	
		}
		//for(int i=1;i<a)
		System.out.print("largest no is:"+large);
		//System.out.print(arr1.length);
		
	}

}
