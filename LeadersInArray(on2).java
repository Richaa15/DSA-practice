import java.util.Scanner;
class LeadersInArray{
	void printLeaders(int arr[], int n){
		for (int i = 0; i < n; i++){
			int j;
			for (j = i + 1; j < n; j++){
				if (arr[i] <=arr[j])
					break;
			}
			if (j == n) 
				System.out.print(arr[i] + " ");
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
