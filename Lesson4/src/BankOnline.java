import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankOnline {
    private String account;
    private double money_order;

    BankOnline (String account, double money_order) {
        this.account = account;
        this.money_order = money_order;
    }

    public void send (String account, double money_order) throws InvalidCardNumberException, NegativeTransferException, OutOfLimitTransferException, TransferToBlockedCardException, NullException {
        String[] bc = new String[3];
        int i = 0;

        try {
            File blocked_card = new File("C:\\Users\\aguil\\IdeaProjects\\SberPractice1\\Lesson4\\src\\BlockedCard");
            FileReader fr = new FileReader(blocked_card);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                bc[i] = line;
                line = reader.readLine();
                i++;
            }

        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }

        if (account.length() != 16) {
            throw new InvalidCardNumberException("Введен неверный номер");
        }

        if (money_order < 0) {
            throw new NegativeTransferException("Введена неверная сумма перевода");
        }

        if (money_order > 50_000) {
            throw new OutOfLimitTransferException("Превышен лимит перевода");
        }

        for(int j = 0; j < bc.length ; j++) {
            if (account.equals(bc[j])) {
                throw new TransferToBlockedCardException("Перевод на заблокированную карту");
            }
        }

        if (account == null | money_order == 0) {
            throw new NullException("Отсутствует номер карты или сумма перевода");
        }

        System.out.printf("Перевод на сумму %s на счет %s прошел успешно", money_order, account);
    }
}
