package Operaciones;

import ObjetoDeValor.Fecha;

import java.util.ArrayList;

public class Extracto {

    private final Balance balance;
    private Transacciones transacciones;

    public Extracto() {
        this.balance = new Balance();
        this.transacciones = new Transacciones();
    }

    public Extracto(Balance balance){
        this.balance=balance;
    }

    public void depositar(double amount, String fecha) {
        this.balance.aumentarBalance(amount);
        this.transacciones.realizarTranzaccion(
                        new Movimiento(amount, 0, this.balance.getBalance(), new Fecha(fecha))
                );
    }

    public void Retirar(double amount, String date) {
        this.balance.retirarBalance(amount);
        this.transacciones
                .realizarTranzaccion(
                        new Movimiento(0,amount,  this.balance.getBalance(), new Fecha(date))
                );
    }

    public ArrayList<Movimiento> listarTransacciones() {
        return this.transacciones.movimientoArrayList();
    }
}
