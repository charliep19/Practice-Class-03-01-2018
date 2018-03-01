import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
		System.out.println("Is the number true or fasle?"+ comnumbers(12));

	}
	public static boolean comnumbers(int num1) {
		if (num1 %2==0 && num1 %3==0) {
			
			return true;
		}else {
			return false;
			
		}
		}
}
