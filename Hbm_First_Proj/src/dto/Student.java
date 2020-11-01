package dto;

public class Student {
	private int rno;
	private String studentName;
	private float fees;
	public Student() {
		
	}
	public Student(int rno, String studentName, float fees) {
		super();
		this.rno = rno;
		this.studentName = studentName;
		this.fees = fees;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
}
