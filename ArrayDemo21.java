class ArrayDemo21 { 

	static void fun(int arr[]) {
	
		for(int x : arr) {
		
			System.out.println(x);
	
		}

		for(int i = 0; i<arr.length;i++) {
		
			arr[i] = arr[i]+70;
		}
	
	}

	public static void main(String[] args){
	
		int arr[] = {50,20,190};
		fun(arr);
		for(int x :arr){
		
			System.out.println(x);
		}

	}


}
