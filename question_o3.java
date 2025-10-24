abstract class Telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends  Telephone
{
    public void ring()
    {
        System.out.println("Telephone is Ringing");
    }
    public void lift()
    {
        System.out.println("Telephone is Lifted");
    }
    public void disconnect()
    {
        System.out.println("Telephone is Disconnected");
    }

    public static void main(String[] args)
    {
        SmartPhone sp = new SmartPhone();
        sp.ring();
        sp.lift();
        sp.disconnect();
    }
}