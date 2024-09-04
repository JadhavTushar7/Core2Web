import java.util.*;
class ArrayDemo8 {
//Array sum 3
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [5];
		int sum = 0;

		System.out.println(arr.length);

		for (int i = 0; i <5; i++) {
		
			arr[i] = sc.nextInt();
		}
 
		for(int i = 0; i<5;i++){
		
			sum = sum + arr[i];
		}

		System.out.println("Array sum =" + sum);

	}
}



