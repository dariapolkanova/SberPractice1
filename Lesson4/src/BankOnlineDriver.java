public class BankOnlineDriver {
    public static void main(String[] args) {
        BankOnline psb = new BankOnline("5825 4564 7537 9519", 3_000);

        try {
            psb.send("3333333333333333", 50);
        } catch (InvalidCardNumberException e) {
            System.out.println("Проверьте номер карты");
        } catch (NegativeTransferException e) {
            System.out.println("Введена неверная сумма перевода");
        } catch (OutOfLimitTransferException e) {
            System.out.println("Превышен лимит перевода");
        } catch (TransferToBlockedCardException e) {
            System.out.println("Попытка перевести деньги на заблокированную карту");
        } catch (NullException e) {
            System.out.println("Указаны неверные данные для перевода. Укажите номер карты и сумму");
        }
    }
}
