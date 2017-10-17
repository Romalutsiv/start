import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter 1 arg: ");
				double first = Double.valueOf(scanner.next());
				System.out.println("Enter 2 arg: ");
				double second = Double.valueOf(scanner.next());
				while(number <=0 || number >4){
				    System.out.println("Selest operation:");
				    System.out.println("Add (1)");
				    System.out.println("Mult (2)");
				    System.out.println("Sub (3)");
				    System.out.println("Div (4)");
				    number = Integer.valueOf(scanner.next());
				    switch(number){
					    case 1: calc.add(first, second); break;
					    case 2: calc.mult(first, second); break;
					    case 3: calc.sub(first, second); break;
					    case 4: calc.div(first, second); break;
					    default: System.out.println("Sesest operation again!!"); break;
					}
				}
				number = 0;
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit? (yes/no)");
				exit = scanner.next();
			}
		} finally {
			scanner.close();
		}
	}
}