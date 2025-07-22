package section20_packages_and_access_modifiers.pack2;

import section20_packages_and_access_modifiers.pack1.MyPack1Parent;

public class MyPack2Child2
{
    // HAS-A Relationship
    MyPack1Parent parent = new MyPack1Parent();

    public void visibilityTest()
    {
        // only public members are visible inside HAS-A Relationship Within Different Packge
        System.out.println(this.parent.x4);
        this.parent.method4();
    }

}
