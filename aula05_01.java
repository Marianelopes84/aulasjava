public class aula05_01 {
    public static void main(String[] args) {
		int num1 = 1;
		System.out.print(num1);
		System.out.println(" Impar");
		int num2 = 1;
		System.out.print(num2);
		System.out.println(" Impar");		
		int total;
		for(int cont = 1; cont <= 28; cont++){
			total = num1+num2;
			System.out.print(total);
			if(total%2 == 0)
				System.out.println(" Par");
			else
				System.out.println(" Impar");	
			num1 = num2;
			num2 = total;
		}
    }
}
