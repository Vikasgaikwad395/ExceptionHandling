import java.util.Scanner;

class AttendanceShortageException extends RuntimeException{
		public AttendanceShortageException(){
					super();
					System.out.println("AttendanceShortageException()");
		}
		public AttendanceShortageException(String msg) {
				super(msg);
		}
}
class CGPAException extends RuntimeException{
	
	public CGPAException() {
		super();
		System.out.println("CGPAException()");
	}
	public CGPAException(String msg) {
		super(msg);
	}
}

public class CustomizeException {
		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter Attendance = ");
			int Attendance = in.nextInt();
			if(Attendance <= 75) {
				throw new AttendanceShortageException("Student is not eligible for the Exam");
			
			}else
				System.out.println("Student is eligible for the Exam");
			
			
			System.out.println("Enter a CGPA = ");
			int CGPA = in.nextInt();
			if(CGPA <= 7) {
				throw new CGPAException("CGPA is less than 7");
			}else
				System.out.println("CGPA is more than 7");
			}
			
			
		}

