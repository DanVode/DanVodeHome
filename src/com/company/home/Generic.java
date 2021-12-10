package com.company.home;

public class Generic{

    public static void main(String[] args) {

        Account acc1 = new Account(4437, 3000);
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("id5634", 3000);
        System.out.println(acc2.getId());
    }
}
class Account{

    private Object id;
    private int sum;

    Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}