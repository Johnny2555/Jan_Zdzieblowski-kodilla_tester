package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    public Bank(CashMachine [] cashMachines){
        this.cashMachines = cashMachines;
    }
    public int getBalance(CashMachine []cashMachines) {
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalBalance += cashMachines[i].sumTransaction();
        }
        return totalBalance;
    }
    public int getTransactionPaycheck(){
        int totalPaycheck = 0;
        for (int i=0;i<cashMachines.length;i++){
            totalPaycheck += cashMachines[i].getPaycheck();
        }
        return totalPaycheck;

    }
    public int getTransactionPayment(){
        int totalPayment = 0;
        for (int i=0;i<cashMachines.length;i++){
            totalPayment += cashMachines[i].getPayment();
        }
        return totalPayment;

    }




}
