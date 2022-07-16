public class TristinProctor {
	private String firstName;
	private String lastName;
	private String uciNetID;
	private int studentNumber;
	
	public TristinProctor() {
		firstName = "Tristin";
		lastName = "Proctor";
		uciNetID = "tproctor";
		studentNumber = 41591638;
	}
	
	//This method returns your full name, with spacing, as a string.
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	//This method returns your first name as a string.
	public String getFirstName() {
		return firstName;
	}
	
	//This method returns your last name as a string.
	public String getLastName() {
		return lastName;
	}
	
	//This method returns your UCInetID as a string.
	public String getUCInetID() {
		return uciNetID;	
	}
	
	//This method returns your UCI student number.
	public int getStudentNumber() {
		return studentNumber;	
	}
	
	//This method returns your name, rotated (with wrap-around), by ’shift’ characters. 
	//Positive numbers rotate to the left, and negative numbers rotate to the right. 
	public String getRotatedFullName(int shift) {
		String name = getFullName();
		
		if(shift > 0) {
			name = name.substring(shift) + name.substring(0, shift);
		}
		else if(shift < 0) {
			shift = Math.abs(shift);
			shift = name.length() - shift;
			name = name.substring(shift) + name.substring(0, shift);
		}
		
		return name;
	}
	
	public static void main(String[] args) {
		TristinProctor a = new TristinProctor();
		System.out.println(a.getFullName());
		System.out.println(a.getFirstName());
		System.out.println(a.getLastName());
		System.out.println(a.getUCInetID());
		System.out.println(a.getStudentNumber());
		System.out.println(a.getRotatedFullName(2));
		System.out.println(a.getRotatedFullName(-5));
	}
}