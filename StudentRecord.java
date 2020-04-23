package question_2;

import java.util.*; 

public class StudentRecord 
{
    // Contains a list of students details
    private Vector<Student> students = new Vector(); 

    public StudentRecord()
    {
        Student s = new Student("Sruthi","Senthil",true);
        students.addElement(s);
        s = new Student("Hari","Prasath",false);
        students.addElement(s);
        s = new Student("Ponni","Murugan",true);
        students.addElement(s);
        s = new Student("Kavi","Bharathi",false);
        students.addElement(s);
        s = new Student("Ashika","Parveen",true);
        students.addElement(s);
        s = new Student("Navee","Priya",true);
        students.addElement(s);
        s = new Student("Alagu","Meena",false);
        students.addElement(s);
        s = new Student("Shravan","Raj",true);
        students.addElement(s);
        s = new Student("Santhosh","Nath",true);
        students.addElement(s);
        s = new Student("Supriyaa","Pi",false);
        students.addElement(s);
    }
    
    /**
     * @return the students
     */
    public Vector<Student> getStudents() 
    {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Vector<Student> students) 
    {
        this.students = students;
    }

}
