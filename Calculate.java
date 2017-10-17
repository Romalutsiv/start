public class Calculate{
    public static void main(String[] arg){
		System.out.println("Виберіть дію: /n/t додавання (1) /n/t віднімання (2) /n/t множення (3) /n/t ділення (4).");
       System.out.println("Calculating...");
	   int first = Integer.valueOf(arg[0]);
	   int second = Integer.valueOf(arg[1]);
	   int summ = first + second;
	   System.out.println("Summ = " + summ);
    }
}