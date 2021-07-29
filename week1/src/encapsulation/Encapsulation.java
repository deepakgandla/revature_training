package encapsulation;
import thursdayproblems.ConvertLastCharToUpper;


public class Encapsulation {

	public static void main(String[] args) {
		Student s1 = new Student(68, "Deepak");
		s1.setName("John");
		System.out.println(s1.getName());
		System.out.println(ConvertLastCharToUpper.lastChartoUpper(s1.getName()));
	}

}
