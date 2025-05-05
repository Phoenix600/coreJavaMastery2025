package section21_exception_handling;

/**
 *
 * Learning About Builtin Classes In Java
 *
 *                  Object
 *                   |
 *                Throwable
 *                 /     \
 *          Exception    Error
 *              /          \
 *
 */

class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class Example7 {
    
    public static void main(String[] args)
    {

    }
}
