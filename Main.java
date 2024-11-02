package caluclator;
import java.util.Scanner;
public class Main {

	static Scanner inp = new Scanner(System.in);
	static Integer choice = null;
	static Integer input1 = null;
	static Integer input2 = null;

	public static void main(String[] args) {
		while(true) {
			showMenu();
			ReadChoice();
			operate(choice);	
		}
	}

	private static void operate(Integer choice) {
		// TODO Auto-generated method stub
		MOperator mp = new MOperator();
		switch(choice) {
			case 1: 
				readInput();
				System.out.println("Addition: "+mp.add(input1,input2));
				break;
			case 2: 
				readInput();
				System.out.println("Subtraction: "+mp.sub(input1,input2));
				break;				
			case 3:
				readInput();
				System.out.println("Division: "+mp.div(input1,input2));
				break;			
			case 4:
				readInput();
				System.out.println("Multiplication: "+mp.mul(input1,input2));
				break;				
			case 5:
				readInput();
				System.out.println("Modulo: "+mp.mod(input1,input2));
				break;
			case 6:
				System.out.println("Thank you, bye !!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input !!");
				break;
		}
		
	}

	private static void readInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter First value: ");
		input1 = inp.nextInt();
		System.out.println("Enter Second value: ");
		input2 = inp.nextInt();
	}

	private static void ReadChoice() {
		// TODO Auto-generated method stub
		choice = inp.nextInt();
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1: Addition\n"
				+ "2: Subtraction\n"
				+ "3: Division\n"
				+ "4: Multiplication\n"
				+ "5: Modulo\n"
				+ "6: Exit");
	}

}
