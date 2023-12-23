package Imp;

import BANK.Account;

public class AccountImp implements Account {
    private int number;
    private int remainded;
    public AccountImp(int number, int remainded){
        this.number = number;
        this.remainded = remainded;

    }

    @Override
    public int number() {
        return number;
    }


    @Override
    public int remainded() {
        return remainded;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRemainded(int remainded) {
        this.remainded = remainded;
    }
}
