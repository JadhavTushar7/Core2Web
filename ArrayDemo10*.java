import java.util.*;
class ArrayDemo9{

	public static void main(String[] args) {
	
		Scanner sc = new  Scanner(System.in);

		System.out.println("Enter Array size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println("Enter Elements");
for ( int i =0; i<arr.length;i++){

   arr[i] = sc.nextInt();
}
}
}
