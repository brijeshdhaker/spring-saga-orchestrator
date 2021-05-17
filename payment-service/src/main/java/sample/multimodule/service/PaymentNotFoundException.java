package sample.multimodule.service;

public class PaymentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public PaymentNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}
