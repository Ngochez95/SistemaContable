package datos.definiciones;

import datos.definiciones.Transaccion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T20:21:41")
@StaticMetamodel(LibroDiario.class)
public class LibroDiario_ { 

    public static volatile SingularAttribute<LibroDiario, Date> fecha;
    public static volatile SingularAttribute<LibroDiario, Integer> idLibroDiario;
    public static volatile SingularAttribute<LibroDiario, Double> total;
    public static volatile SingularAttribute<LibroDiario, Boolean> tipoLibroDiario;
    public static volatile SingularAttribute<LibroDiario, String> concepto;
    public static volatile ListAttribute<LibroDiario, Transaccion> transaccionList;

}