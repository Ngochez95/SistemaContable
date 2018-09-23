/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contables;

import datos.definiciones.Cuenta;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class metodos {


//
//    public boolean cuentas(List<Cuenta> c, int id, int nivel) {
//        for (Cuenta cuenta : c) {
//            if (cuentas(c, cuenta.getIdCuenta(), (cuenta.getNivelCuenta() + 1)) == true) {
//                if (cuenta.getIdCuentaPadre().getIdCuenta() == id && cuenta.getNivelCuenta() == nivel) {
//                    System.out.println("cuenta: " + cuenta.getNombreCuenta());
//                }
//            }
//        }
//        return false;
//    }

    public void prueba2(List<Cuenta> cuenta, int tamanio, int id) {
        for (int i = 0; i < tamanio; i++) {
            if (cuenta.get(i).getIdCuentaPadre() != null) {
                if (cuenta.get(i).getIdCuentaPadre().getIdCuenta() == id) {
                    System.out.println("cuenta: " + cuenta.get(i).getNombreCuenta());
                    prueba2(cuenta, tamanio, cuenta.get(i).getIdCuenta());
                }
            }
        }
    }
    

    public void prueba3(List<Cuenta> cuentas, int id) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getIdCuentaPadre() != null) {
                if (cuenta.getIdCuentaPadre().getIdCuenta() == id) {
                    System.out.println("cuenta: " + cuenta.getNombreCuenta());
                    prueba3(cuentas, cuenta.getIdCuenta());
                }
            }
        }
    }

}
