public class ClientMain {

    public static void main(String[] args) {

        Order ord = new Order(new BankTransfer());

        System.out.println(  ord.ShowMaony());
    }
}
