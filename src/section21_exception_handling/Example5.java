package section21_exception_handling;

class InvalidEmailAddressException extends Exception
{
   // Data Part

   // Constructor
   public InvalidEmailAddressException(String exceptionMessage)
   {
      super(exceptionMessage);
   }
   // Getters And Setter
}

public class Example5
{

   public static String getUsername(String email) throws InvalidEmailAddressException
   {
      boolean isValidEmail = email.contains("@gmail.com");
      if(!isValidEmail)
      {
         throw new InvalidEmailAddressException(email + " is not valid");
      }

      String username = email.substring(0,email.indexOf("@gmail.com"));
      return username;

   }

   public static void main(String...args)
   {
      try {
         getUsername("pranayramteke@test.com");
      }catch (InvalidEmailAddressException e)
      {
         System.out.println(e.getMessage());
         e.printStackTrace();
      }
   }
}
