package sample.multimodule.service;

public class InventoryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public InventoryNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}
