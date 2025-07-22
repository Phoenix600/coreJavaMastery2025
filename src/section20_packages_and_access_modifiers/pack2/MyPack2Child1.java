package section20_packages_and_access_modifiers.pack2;

import section20_packages_and_access_modifiers.pack1.MyPack1Parent;

public class MyPack2Child1 extends MyPack1Parent
{
    public void visibility()
    {
        // private and default members are hidden inside IS-A relation at different package level.
        System.out.println(this.x2);
        System.out.println(this.x4);

        this.method2();
        this.method4();
    }
}
