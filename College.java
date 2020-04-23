package question_2;

public class College 
{
    // college maintains the record for students 
    private StudentRecord sr = new StudentRecord();

    public StudentRecord getSr() 
    {
        return sr;
    }

    public void setSr(StudentRecord sr) 
    {
        this.sr = sr;
    }
}
