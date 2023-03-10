package march1;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {2,44,5,12,77,88,99};
		int ele=22, flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("element searched");
				flag=1;
				break;
				
			}
		}
		if(flag==0)
		{
			System.out.println("element not found");
		}

	}

}
