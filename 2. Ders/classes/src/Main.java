public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();


    }
}