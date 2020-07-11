import java.util.Scanner;

class hello {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String inputName;
		int inputAge;
		String inputAddress;
		
		System.out.print("Nama anda : ");
		inputName = input.nextLine();
		
		System.out.print("Usia anda  : ");
		inputAge = input.nextInt();
		input.nextLine();
		
		System.out.print("Alamat anda  : ");
		inputAddress = input.nextLine();
	
		
		System.out.println("Good Morning ...");
		System.out.print("My name is " + inputName + "; i'm  " + inputAge + " years old ; " + " my address " + inputAddress);
  }
}