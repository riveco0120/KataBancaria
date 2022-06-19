package Operaciones;

import java.util.ArrayList;

public class Transacciones {

    ArrayList<Movimiento> movimientos;

    public Transacciones() {
        this.movimientos = new ArrayList<>();
    }

    public void realizarTranzaccion(Movimiento movimiento){
        this.movimientos.add(movimiento);
    }

    public ArrayList<Movimiento>movimientoArrayList(){
        return this.movimientos;
    }
}
