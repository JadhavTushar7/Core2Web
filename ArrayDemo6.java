import java.util.*;
class ArrayDemo6{
//Array sum

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];


	
	for (int i = 0;i<5;i++){
	
		arr[i] = sc.nextInt();
		
	
	}

	 // cide 1 
	
	int sum = arr[0]+arr[1]+ arr[2]+arr[3]+arr[4];
	System.out.println("Array sum = " + sum);




	}
}
