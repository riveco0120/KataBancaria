package Operaciones;

public class Balance {

    private  Double balance;

    public Balance(){

    }

    public Balance(Double balance) {
        this.balance = balance;
    }

    public void aumentarBalance(double monto){
        this.balance = balance + monto;
    }

    public void retirarBalance(double monto){
        this.balance = balance-monto;
    }

    public double getBalance(){
        return this.balance;
    }
}
