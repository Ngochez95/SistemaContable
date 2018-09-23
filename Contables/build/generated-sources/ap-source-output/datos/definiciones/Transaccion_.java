package datos.definiciones;

import datos.definiciones.Cuenta;
import datos.definiciones.LibroDiario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T20:21:41")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Integer> idTransaccion;
    public static volatile SingularAttribute<Transaccion, LibroDiario> idLibroDiario;
    public static volatile SingularAttribute<Transaccion, Double> abono;
    public static volatile SingularAttribute<Transaccion, Boolean> tipoValor;
    public static volatile SingularAttribute<Transaccion, Double> cargo;
    public static volatile SingularAttribute<Transaccion, Cuenta> idCuenta;

}