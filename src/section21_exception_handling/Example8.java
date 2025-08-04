package section21_exception_handling;

class StudentNotAllowedException extends Exception
{
    // Data
    public static final String TIME_OUT_MESSAGE = "STUDENT IS LATE .....OUT!!!!";
    public static final String NOT_IN_UNIFORM_MESSAGE = "STUDENT YOU'RE NOT IN UNIFORM....OUT!!!";
    // constructors
    public StudentNotAllowedException(String message)
    {
        super(message);
        System.out.println("StudentNotAllowedException Constructor Called....");
    }
}

public class Example8
{

    public static void entranceGateOfClass(int time, boolean isInUniform) throws StudentNotAllowedException
    {
        if(time > 1)
        {
            throw new StudentNotAllowedException(StudentNotAllowedException.TIME_OUT_MESSAGE);
        }

        if(!isInUniform)
        {
            throw new StudentNotAllowedException(StudentNotAllowedException.NOT_IN_UNIFORM_MESSAGE);
        }
    }

    public static void main(String[] args) {
        try
        {
            entranceGateOfClass(4,false);
        }catch (StudentNotAllowedException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


}
