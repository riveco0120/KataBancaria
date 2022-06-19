import Operaciones.Extracto;
import model.Account;

import static util.UtilBancario.amountOf;
import static util.UtilBancario.date;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Extracto());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.deposit(amountOf(2000), date("13/01/2021"));
        account.withdraw(amountOf(500), date("14/01/2021"));

        account.printStatements(System.out);
    }
}
