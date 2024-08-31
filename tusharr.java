class vaishnavii {
  
	public static void main(String[] args){
 

		String str = "netflix";
		     System.out.println("Befor switch");
		
		switch(str) {

			case "prime video" :
				{
				String str1 = "movies";
				switch(str1){
				
					case "movies":
						System.out.println("hindi movies");
						break;

					case "tv show":
					    	System.out.println("series");
						break;
				
				}
				}
		break;

		           case "netflix": {
						   String str1 = "movie";
				
				switch(str1){
				
					case "movies":
						System.out.println("hindi movies");
						break;

					case "tv show":
					 	System.out.println("series");
						break;

			}		   
		
		}
		break;
		}

     System.out.println("After switch");
  
    }
}

