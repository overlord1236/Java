
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter last member of the sequence:");
        int sequenseLong = scan.nextInt();
        System.out.printf("Select method of calculating:\n 1 - Normal method\n 2 - Recursive method ");
        int methodNumber = scan.nextInt();
        switch (methodNumber){
	        case 1: System.out.println(fib(sequenseLong));
	        	break;
	        case 2: System.out.println(fib_rec(sequenseLong));
	        	break;
        }
        scan.close();
	}
	
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		int x=1, y=0,lastNumber=0;
		for(int i=1;i<=n;i++){
			lastNumber = x + y;
			x = y;
			y = lastNumber;
		}
		return lastNumber;
	}
	
	public static int fib_rec(int n){
		if(n==0){
			return 0;
		}
		return n<=1? n : fib_rec(n-1)+fib_rec(n-2);
	}
}