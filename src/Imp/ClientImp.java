package Imp;

import BANK.Account;
import BANK.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientImp implements Client {
    String name;
    String surname;
    int passportSerries;
    double passportNumber;
    private List<AccountImp> accountImpList = new ArrayList<>();
    public ClientImp(String name,String surname,
                     int passportSerries,double passportNumber){
        this.name = name;
        this.surname = surname;
        this.passportSerries = passportSerries;
        this.passportNumber = passportNumber;
    }
    public Account getCheck() {
        for (int i = 0; i < accountImpList.size() ; i++) {
            accountImpList.get(i).number();
            return accountImpList.get(i);
        }
        return null;
    }
    public List<AccountImp> getAllCheck(){
        return accountImpList;
    }
    public void addCheck(AccountImp accountImp){
        accountImpList.add(accountImp);
    }
    public void removeCheck(AccountImp accountImp){
        accountImpList.remove(accountImp);
    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public int passportSerries() {
        return passportSerries;
    }

    @Override
    public double passportNumber() {
        return passportNumber;
    }
}
