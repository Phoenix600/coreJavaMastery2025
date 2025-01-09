package section16_abstract_class_in_oop;

abstract class Hospital
{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
    abstract void discharge();
}

class RoseMerryChristianHospital extends Hospital
{

    @Override
    void emergency() {
        System.out.println("Emergency Procedure In RoseMerryChristianHospital");
    }

    @Override
    void appointment() {
        System.out.println("Appointment Procedure In RoseMerryChristianHospital");
    }

    @Override
    void admit() {
        System.out.println("Admit Procedure In RoseMerryChristianHospital");

    }

    @Override
    void billing() {
        System.out.println("Billing Procedure In RoseMerryChristianHospital");

    }

    @Override
    void discharge() {
        System.out.println("Discharge Procedure In RoseMerryChristianHospital");

    }
}


public class Example2 {
    public static void main(String[] args) {

    }
}
