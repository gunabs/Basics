package github;

public class SecondMaxValue {

	public static void main(String[] args) {
		
		int arr[]= {98,76,66,100,52,35,67};
		
         int max=Integer.MIN_VALUE;
         int secondmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax)
			{
				secondmax=arr[i];
			}
		}
	}

}
