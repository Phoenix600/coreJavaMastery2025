package section17_interfaces_in_oop;

interface IPremiumMember
{
    void notifyCustomer();
}

class Customer implements IPremiumMember
{
    String name;

    public Customer(String name)
    {
        this.name = name;
    }

    @Override
    public void notifyCustomer() {
        System.out.println( "Hey! "+ this.name + " Festival Sale will be live in next 24 Hrs");
    }
}

class Shop
{
    private static IPremiumMember[] members = new IPremiumMember[100];
    private static int counter = 0;

    public void registerMember(IPremiumMember member)
    {
        members[counter++] = member;
    }

    public void notifyAllCustomers()
    {
        for (int i=0; i<counter; i++)
        {
            members[i].notifyCustomer();
        }
    }

}

public class Example3 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Phoenix");
        Customer customer2 = new Customer("Clark");
        Customer customer3 = new Customer("Bruce");
        Customer customer4 = new Customer("Peter");
        Customer customer5 = new Customer("Linus");
        Customer customer6 = new Customer("Jane");
        Customer customer7 = new Customer("John");

        Shop dMartNagpur = new Shop();
        dMartNagpur.registerMember(customer1);
        dMartNagpur.registerMember(customer2);
        dMartNagpur.registerMember(customer3);
        dMartNagpur.registerMember(customer4);
        dMartNagpur.registerMember(customer7);


        dMartNagpur.notifyAllCustomers();

    }
}
