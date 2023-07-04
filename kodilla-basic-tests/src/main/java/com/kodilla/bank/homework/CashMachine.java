package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transaction;
    private int size;

    public CashMachine(){
        this.transaction = new int[100];
        this.size = 0;
    }
    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.size - 1] = value;
        this.transaction = newTab;
    }


    public void payment (int kwota){
         add(kwota);
    }
    public void paycheck (int kwota){
        add(-kwota);

    }

    public int[] getTransaction() {
        return transaction;
    }
    public int sumTransaction(){
        int sum =0;
        for (int i=0;i<size;i++){
            sum = sum + transaction[i];
        }
        return sum;

    }
    public int getPaycheck(){
        int paycheck = 0;
        for (int i=0; i<size;i++){
            if(transaction[i]<0){
                paycheck++;
            }

        }
        return paycheck;
    }
    public int getPayment(){
        int payment = 0;
        for (int i=0; i<size;i++){
            if(transaction[i]>0){
                payment++;
            }

        }
        return payment;
    }
    //public int getAveragePaycheck() {
      //  int average = 0;
       // for (int i=0; i<getPaycheck())
    //}
   // public int getNumberofTransaction() {
     //   return size;
    }

