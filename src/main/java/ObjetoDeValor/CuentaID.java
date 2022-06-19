package ObjetoDeValor;

import java.util.UUID;

public class CuentaID {

    private final String cuentaId;

    public CuentaID(){
        this.cuentaId= UUID.randomUUID().toString();
    }

    public String getCuentaId(){
        return cuentaId;
    }
}
