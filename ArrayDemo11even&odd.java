import java.util.*;
class ArrayDemo11{

	public static void main(String[] args) {
	
		Scanner sc = new  Scanner(System.in);

		System.out.println("Enter Array size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println("Enter Elements");

		for(int i=0; i<arr.length;i++){


			arr[i]= sc.nextInt();
		}


		int evenCount = 0;
	            int oddCount =0;         

		for(int i =0; i <arr.length;i++){
			
				if(arr[i] % 2 == 0) {
				
					evenCount++;
				} else {
					oddCount ++;

				}
			}

			   System.out.println("Even count = " + evenCount);

			     System.out.println("odd count = " + oddCount);

	}
}
