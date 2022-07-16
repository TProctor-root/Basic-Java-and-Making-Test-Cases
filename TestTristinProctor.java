import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTristinProctor {
	
	//Full Name Test
	@Test
	public void Test_1() {
		TristinProctor a = new TristinProctor();
		String test = "Tristin Proctor";
		assertEquals(a.getFullName(), test);
	}
	
	//First Name Test	
	@Test
	public void Test_2() {
		TristinProctor a = new TristinProctor();
		String test = "Tristin";
		assertEquals(a.getFirstName(), test);
	}
	
	//Last Name Test
	@Test
	public void Test_3() {
		TristinProctor a = new TristinProctor();
		String test = "Proctor";
		assertEquals(a.getLastName(), test);
	}
	
	//UCInetID Test
	@Test
	public void Test_4() {
		TristinProctor a = new TristinProctor();
		String test = "tproctor";
		assertEquals(a.getUCInetID(), test);
	}
	
	//Student Number Test
	@Test
	public void Test_5() {
		TristinProctor a = new TristinProctor();
		int test = 41591638;
		assertEquals(a.getStudentNumber(), test);
	}
	
	//Rotate Full Name Test 1: Positive Number
	@Test
	public void Test_6() {
		TristinProctor a = new TristinProctor();
		String test = "istin ProctorTr";
		assertEquals(a.getRotatedFullName(2), test);
	}
	
	//Rotate Full Name Test 2: Negative Number
	@Test
	public void Test_7() {
		TristinProctor a = new TristinProctor();
		String test = "octorTristin Pr";
		assertEquals(a.getRotatedFullName(-5), test);
	}

}
