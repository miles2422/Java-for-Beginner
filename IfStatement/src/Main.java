import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		if(age > 18){
			System.out.println("Qualified");
		}else {
			System.out.println("Not-Qualified");
		}
		
	}

}
