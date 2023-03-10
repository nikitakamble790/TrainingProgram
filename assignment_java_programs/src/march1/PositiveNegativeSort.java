package march1;

public class PositiveNegativeSort {

	public static void main(String[] args) {
		int arr1[]= {1,-3,2,3,5,-4,-6,9,-2};
		int size=arr1.length;
		int left,right;
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+"\t");
		}
		for(int i=0;i<size;i++)
		{
			if(arr1[i]>0)
			{
				int temp=arr1[i];
				arr1[i]=arr1[size-1];
				arr1[size-1]=temp;
			}
			System.out.println();
			for(int k=0;k<size;k++)
			{
				System.out.print(arr1[k]+"\t");
			}
		}
		//
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=0;i<size;i++)
		{
			if(arr1[i]<0)
			{
				System.out.println(i);
			
				int temp=arr1[i];
				int j=i+1;
				while(j<size)
				{
					arr1[j]=arr1[j+1];
					j++;
				}
				for(int k=0;k<arr1.length;k++)
				{
					System.out.print(arr1[i]+"\t");
				}
			}
			/*else if(arr1[i]>0)
			{
				int temp=arr1[i];
				arr1[i]=arr1[0];
				arr1[0]=temp;
			}*/
				
		
		/*for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"\t");
		}
		}*/

	


