package sample.multimodule.service;

public class OrderNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public OrderNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}
