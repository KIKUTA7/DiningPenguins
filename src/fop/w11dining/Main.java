package fop.w11dining;

public class Main {
    public static void main(String[] args) {
        
        Table table = new Table(4);

        Penguin peter = new Penguin("peter", table);
        Penguin paul = new Penguin("paul", table);
        Penguin pam = new Penguin("pam", table);
        Penguin paula = new Penguin("paula", table);

        Thread petersCustomerThread = new Thread(peter);
        Thread paulsCustomerThread = new Thread(paul);
        Thread pamsCustomerThread = new Thread(pam);
        Thread paulasCustomerThread = new Thread(paula);
        
        petersCustomerThread.start();
        paulsCustomerThread.start();
        pamsCustomerThread.start();
        paulasCustomerThread.start();


        try {
            petersCustomerThread.join();
            paulsCustomerThread.join();
            pamsCustomerThread.join();
            paulasCustomerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Interrupted!");
            return;
        }

    }
}
