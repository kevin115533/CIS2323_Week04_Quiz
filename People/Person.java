package People;

public class Person {
	private String firstName, lastName;
	private int age;
	private char sex;
	
	public void setFirst(String x){
		firstName = x;
	}
	
	public void setLast(String x){
		lastName =x;
	}
	
	public void setAge(int x){
		age = x;	
	}
	
	public void setSex(char x){
		sex = x;
	}
	
	public String getFirst(){
		return firstName;	
	}
	
	public String getLast(){
		return lastName;	
	}
	
	public int getAge(){
		return age;	
	}
	
	public char getSex(){
		return sex;	
	}
	
	public String getPersonInfo(){
		return "First Name: " + firstName + "\n"
		+ "Last Name: " + lastName + "\n"
		+ "Age: " + age + "\n"
		+ "Sex: " + sex; 
	}
}