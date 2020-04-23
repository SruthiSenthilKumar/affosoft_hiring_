package question_2;
import java.util.*;
import java.text.*;

public class Student 
{
    private String First_name;
    private String Last_name; 
    private boolean isPresent;
       
    
    Student(String First_name, String Last_name, boolean isPresent)
    {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.isPresent = isPresent;
    }
    
    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) 
    {
        this.First_name = First_name;
    }

    public String getLast_name() 
    {
        return Last_name;
    }

    public void setLast_name(String Last_name) 
    {
        this.Last_name = Last_name;
    }

    public boolean isIsPresent() 
    {
        return isPresent;
    }

    public void setIsPresent(boolean isPresent) 
    {
        this.isPresent = isPresent;
    }
}
