package model;

import ObjetoDeValor.CuentaID;
import Operaciones.Extracto;

public class Account {

    private final CuentaID cuentaId;
    private final Extracto extracto;

    public Account(Extracto extracto) {
        this.cuentaId = new CuentaID();
        this.extracto = extracto;
    }

    void deposit(double amount, String date) {
        this.extracto.depositar(amount, date);

    }

    void withdraw(double amount, String date){
        this.extracto.Retirar(amount, date);

    }

    void printStatements() {
        this.extracto.listarTransacciones().forEach(m -> System.out.println(m.toString()));
    }

}
