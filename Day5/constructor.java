package Day5;
abstract class PaymentGateway{
    void printReceipt(){
        System.out.println("Receipt Generated");
    }

    abstract void processPayment(double amount)

    
}
class UPIPayment extends PaymentGateway{
    @override
    void processPayment(double amount){
        System.out.println("Processing ");
    }
}