package github;

public class maxvalue {

	public static void main(String[] args) {
		
		int arr[]= {34,18,49,98,69,55};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		
	}

}
