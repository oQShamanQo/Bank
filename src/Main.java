import BANK.Account;
import BANK.Client;
import Imp.AccountImp;
import Imp.ClientImp;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account account = new AccountImp(767, 1000);
        Client client = new ClientImp("Олег", "Польский", 3655, 198771);
        Client client1 = new ClientImp("Гоша", "Жарский", 3655, 498981);
        Client client2 = new ClientImp("Олег", "Леонов", 3655, 798771);


    }

}