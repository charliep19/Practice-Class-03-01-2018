import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a word");
String text= scan.nextLine();
System.out.println(Length(text));
	}
	public static boolean Length (String word) {
		int length=word.length();
		if (length %2==0) {
			return true;
		}else {
			return false;
		}
	}

}
