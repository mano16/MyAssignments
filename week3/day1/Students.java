package week3.day1;

public class Students {
	public void getStudents(int id) {
		System.out.println("My id is " + id);

	}
	public void getStudents(int id, String name) {
		System.out.println("My id is " + id + " and name is " + name );

	}
	public void getStudents(String email,int phoneNumber) {
		System.out.println("My email is " + email + " and phone number is " + phoneNumber);

	}
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudents(1224);
		s.getStudents(1224, "Mano");
		s.getStudents("test@gmail.com", 12345678);
	}

}
