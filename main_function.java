package question_2;
import java.util.*;
public class main_function 
{
    public static void StudentsPresent(College c)
    {
        StudentRecord record = c.getSr();
        Vector<Student> studentList = record.getStudents();
        Enumeration<Student> enumeration;
        enumeration = studentList.elements();
        while(enumeration.hasMoreElements())
        {
            Student x = enumeration.nextElement();
            if(x.isIsPresent() == true)
                System.out.println(x.getFirst_name() + " " + x.getLast_name());
        }
    }
    public static void main(String[] args) 
    {
        College c = new College();
        System.out.println("Students who are present in the college...");
        StudentsPresent(c);
    }
}
