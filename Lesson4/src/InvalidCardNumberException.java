public class InvalidCardNumberException extends BankOnlineException {
    InvalidCardNumberException() {}

    InvalidCardNumberException(String message) {
        super(message);
    }
}
