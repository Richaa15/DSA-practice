import java.util.*;
class LeadersInArray{
	void printLeaders(int arr[], int n)	{
		int max = arr[n-1];
		System.out.print(max + " ");
	
		for (int i = n-2; i >= 0; i--){
			if (max < arr[i]){		
			max = arr[i];
			System.out.print(max + " ");
			}
		}
	}
	public static void main(String[] args){
		LeadersInArray l = new LeadersInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("The leader elements are: ");
		l.printLeaders(arr, n);
	}
}
