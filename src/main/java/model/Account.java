package model;

import ObjetoDeValor.CuentaID;
import Operaciones.Extracto;

import java.io.PrintStream;

public class Account {

    private final CuentaID cuentaId;
    private final Extracto extracto;

    public Account(Extracto extracto) {
        this.cuentaId = new CuentaID();
        this.extracto = extracto;
    }

    public void deposit(double amount, String date) {
        this.extracto.depositar(amount, date);

    }

    public void withdraw(double amount, String date){
        this.extracto.Retirar(amount, date);

    }

    public void printStatements(PrintStream out) {
        this.extracto.listarTransacciones().forEach(m -> System.out.println(m.toString()));
    }

}
