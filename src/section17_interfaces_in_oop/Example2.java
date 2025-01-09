package section17_interfaces_in_oop;


import jdk.jshell.Snippet;

class Phone
{
    public void call()
    {
        System.out.println("Call Method Of Phone Class");
    }

    public void sms()
    {
        System.out.println("Sms Method Of Phone Class");
    }

}

/**
 * ICamera is an interface
 */
interface ICamera
{
    void click();
    void record();
}

/**
 * IMusicPlayer is an interface
 */
interface IMusicPlayer
{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("SmartPhone Video Call");
    }


    @Override
    public void click() {
        System.out.println("SmartPhone Click Method");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone Record Method");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone MusicPlayer Method");
    }

    @Override
    public void pause() {
        System.out.println("SmartPhone Pause Method");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone Stop Method");
    }
}

public class Example2 {
    public static void main(String[] args) {

        // Visibility of methods depends on the methods present in interface/ abstract class/ class
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.sms();
        smartPhone.call();

        smartPhone.click();
        smartPhone.record();

        smartPhone.play();
        smartPhone.pause();
        smartPhone.stop();

        smartPhone.videoCall();

        Phone phone = new SmartPhone();
        phone.call();
        phone.sms();

        ICamera camera = new SmartPhone();
        camera.click();
        camera.record();

        IMusicPlayer musicPlayer = new SmartPhone();
        musicPlayer.pause();
        musicPlayer.play();
        musicPlayer.stop();

    }
}
