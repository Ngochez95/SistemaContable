
package contables;


import datos.acceso.CuentaFacade;
import datos.definiciones.Cuenta;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author ngochez
 */
public class Contables {

    public static void main(String[] args) {

        Principal frmPrincipal = new Principal();
        frmPrincipal.setLocation(250, 200);
        frmPrincipal.setVisible(true);
        
        metodos m= new metodos();
        CuentaFacade cuenta= new CuentaFacade();
        List<Cuenta> lista= cuenta.findAll();
        
        // metodos m = new metodos();
        //CuentaFacade cuenta = new CuentaFacade();
        //System.out.println("hi: "+cuenta.find(01).getNombreCuenta());
       // List<Cuenta> lista = cuenta.findAll();

//        int tamanio = 0;
//        for (Cuenta cuenta1 : lista) {
//            tamanio = tamanio + 1;
//        }
//        System.out.println("tamnio: " + tamanio);
//        for (int i = 0; i < tamanio; i++) {
//            if (lista.get(i).getIdCuentaPadre() == null) {
//                System.out.println("Cuentaaa: " + lista.get(i).getNombreCuenta());
//                m.prueba2(lista, tamanio, lista.get(i).getIdCuenta());
//            }
//        }
        
        System.out.println("Cuenta: " + ((Cuenta)(lista.get(1))).getTipoCuenta());
        for (Cuenta cuenta1 : lista) {
            if (cuenta1.getIdCuentaPadre() == null) {
                System.out.println("Cuenta: " + cuenta1.getNombreCuenta());
                m.prueba3(lista, cuenta1.getIdCuenta());
            }
        }

    }
    
}
