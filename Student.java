
public class Student {
private int studentid;
private String studentName;
private int marks;

public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public void display()
{
	System.out.println("student id is "+studentid+"\t"+"student name is "+studentName+"\t"+"student marks are "+marks);
}

}
