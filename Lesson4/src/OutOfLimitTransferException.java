public class OutOfLimitTransferException extends BankOnlineException {
    OutOfLimitTransferException() {}

    OutOfLimitTransferException(String message) {
        super(message);
    }
}
