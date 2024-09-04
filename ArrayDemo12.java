
class ArrayDemo12 {

	public static void main(String[] args) { 
	
	
		int arr[] ={100,1947};
		int arr1[] = {100,1947};

		System.out.println(arr);
		System.out.println(arr1);
		
		System.out.println(System.identityHashCode(arr));
		 System.out.println(System.identityHashCode(arr1));
	
		  System.out.println(System.identityHashCode(arr[0])); 
		  System.out.println(System.identityHashCode(arr1[0]));

		   System.out.println(System.identityHashCode(arr[1])); 
		   System.out.println(System.identityHashCode(arr[1]));
	}


}
