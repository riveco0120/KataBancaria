package Operaciones;

import ObjetoDeValor.Fecha;

public class Movimiento {
    private double monto;
    private double debito;
    private  double saldo;
    private Fecha fecha;

    public Movimiento(double monto, double debito, double saldo, Fecha fecha) {
        this.monto = monto;
        this.debito = debito;
        this.saldo = saldo;
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "MovimientosFinancieros{" +
                "credito=" + monto +
                ", debito=" + debito +
                ", saldo=" + saldo +
                ", fecha=" + fecha.getFecha() +
                '}';
    }

}
