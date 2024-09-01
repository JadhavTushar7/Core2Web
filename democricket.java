import java.io.*;
class PlayerInfo {

	public static void main(String[] args)throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Batsman name");
		String name1 = br.readLine();


	        System.out.println("Enter Bowler name");
                String name2 = br.readLine();

		System.out.println("Batsman name:"  + name1);
		System.out.println("bowler name:"  + name2);
	}

}
