import People.*;
import java.util.Scanner;

public class MakeAPerson {
	public static void main (String[] args){
		String uFirst, uSecond;
		int uAge;
		char uSex;
		Scanner Input1 = new Scanner(System.in);
		Person user = new Person();
		
		System.out.println("What is your first name? " );
		uFirst = Input1.nextLine();
		
		user.setFirst(uFirst);
		
		System.out.println("What is your last name? " );
		uSecond = Input1.nextLine();
		
		user.setLast(uSecond);
		
		System.out.println("What is your age?" );
		uAge = Input1.nextInt();
		
		user.setAge(uAge);
		
		System.out.println("What is your sex M/F? " );
		uSex = Input1.next().charAt(0);
		
		user.setSex(uSex);
		
		System.out.println(user.getPersonInfo());
		
		
		
		
	
	}
}