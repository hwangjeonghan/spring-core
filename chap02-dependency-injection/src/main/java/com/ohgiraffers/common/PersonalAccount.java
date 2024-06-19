package com.ohgiraffers.common;

public class PersonalAccount implements Account {


    private  final int bankCode;

    private final String accNO;

    private  int balance;

    public PersonalAccount(int bankCode, String accNO) {
        this.bankCode = bankCode;
        this.accNO = accNO;
    }

    public int getBankCode() {
        return bankCode;
    }

    public String getAccNO() {
        return accNO;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getBalance() {
        return  this.accNO + "계좌의 현재잔액은" + this.balance + "원 입니다";
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if(money >= 0){
            this.balance += money;
            str = money + "원이 입금되었습니다";
        }else {
            str = "금액을 잘못 입력하셨습니다";
        }


        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";
        if(this.balance >= money){
            this.balance -= money;
            str = money + "원이 출금되었습니다";
        }else {
            str = "잔액이 부족합니다 잔액을 확인해주세요";
        }

        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNO='" + accNO + '\'' +
                ", balance=" + balance +
                '}';
    }
}
