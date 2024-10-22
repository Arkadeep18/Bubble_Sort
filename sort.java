package recursionn;

public class sort {
	public static void main(String[] args) {
		int arr[] = {5,1,6,7,3};
		//Traverse and swapping
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		//Printing sorted array
		System.out.println("The sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print("[ "+arr[i]+" "+"]");
		}
		
	}
}
