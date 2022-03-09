public class NegativeTransferException extends BankOnlineException {
    NegativeTransferException() {}

    NegativeTransferException(String message) {
        super(message);
    }
}
