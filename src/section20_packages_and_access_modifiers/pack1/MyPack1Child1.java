package section20_packages_and_access_modifiers.pack1;

public class MyPack1Child1 extends MyPack1Parent
{
    public void visibilityTest()
    {
        // Only private data members are hidden inside IS-A Relationship (Inheritance) Within Same Package
        System.out.println(this.x2);
        System.out.println(this.x3);
        System.out.println(this.x4);

        this.method2();
        this.method3();
        this.method4();
    }
}
