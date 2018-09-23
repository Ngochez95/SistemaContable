package datos.definiciones;

import datos.definiciones.Cuenta;
import datos.definiciones.Transaccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T20:21:41")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, String> nombreCuenta;
    public static volatile ListAttribute<Cuenta, Cuenta> cuentaList;
    public static volatile SingularAttribute<Cuenta, String> tipoCuenta;
    public static volatile SingularAttribute<Cuenta, String> descripcionCuenta;
    public static volatile SingularAttribute<Cuenta, Integer> idCuenta;
    public static volatile ListAttribute<Cuenta, Transaccion> transaccionList;
    public static volatile SingularAttribute<Cuenta, Cuenta> idCuentaPadre;

}