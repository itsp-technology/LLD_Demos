public class Order {

    PaymentStrgy paymentStrgy ;

    public Order(PaymentStrgy strgyy){
        super();
        this.paymentStrgy=strgyy;
    }

    public int ShowMaony(){
        return paymentStrgy.excutePaymetn();
    }


}
