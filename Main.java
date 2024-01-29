package newExample;

public class Main {

    public static void main(String[] args) {


        Customer customer = new Customer("Emre", "AYBAR", "emreaybar@gmail.com", 1000);
        Customer customerOne = new Customer("Ahmet", "ELMA", "emreaybar@gmail.com", 500);

        System.out.println("İsim :" + customer.getName() + "\nSoyisim :" + customer.getSurName() + "\nE-mail :" + customer.getEmail() + "\nToplam bakiye :" + customer.getMoney());
        System.out.println("İsim :" + customerOne.getName() + "\nSoyisim :" + customerOne.getSurName() + "\nE-mail :" + customerOne.getEmail() + "\nToplam bakiye :" + customerOne.getMoney());

        customer.setMoney(1500);
        customerOne.setEmail("ahmet_aslan@gmail.com");

        System.out.println("Güncellenmiş Müşteri 1 Bakiye: " + customer.getMoney());
        System.out.println("Güncellenmiş Müşteri 2 Email: " + customerOne.getEmail());


    }
}
