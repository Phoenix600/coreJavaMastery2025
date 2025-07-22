package section20_packages_and_access_modifiers.pack1;

public class MyPack1Child2
{
    // HAS-A Relationship
    MyPack1Parent parent = new MyPack1Parent();

    // only private data members / member function are hidden inside HAS-A Relationship within Same Package
    public void visibilityTest()
    {
        System.out.println(parent.x2);
        System.out.println(parent.x3);
        System.out.println(parent.x4);

        parent.method2();
        parent.method3();
        parent.method4();
    }

}

