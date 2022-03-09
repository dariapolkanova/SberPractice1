public class TransferToBlockedCardException extends BankOnlineException {
    TransferToBlockedCardException() {}

    TransferToBlockedCardException(String message) {
        super(message);
    }
}
