package section16_abstract_class_in_oop;

abstract class KFC
{
    public KFC()
    {
        System.out.println("KFC Constructor Called");
    }

    /// Concrete Method
    void makeFoodItem()
    {
        System.out.println("Make Chicken :)");
    }

    ///  Method Abstract Method
    abstract void billing();
    abstract void offer();
}

class CentralNagpurKFC extends KFC{

    // Data Members
    String address;

    public CentralNagpurKFC()
    {
        super();
        System.out.println("CentralNagpurKFC Constructor Called");
    }

    @Override
    public void billing()
    {
        System.out.println("CentralNagpurKFC billing system");
    }

    @Override
    public void offer()
    {
        System.out.println("CentralNagpurKFC offer system");
    }

}


public class Example3 {
}
