package espoch.edu.ec.primermvc.controlador;

import espoch.edu.ec.primermvc.modelo.InterfazOperacion;
import espoch.edu.ec.primermvc.modelo.Operacion;
import espoch.edu.ec.primermvc.modelo.Operaciones;
import espoch.edu.ec.primermvc.vista.Vista;

public class ControladorOperaciones {

    //decidir las accciones
    public void controlarOperacion() {
        Vista vista = new Vista();
        try {

            //parse= convertir un numero string a un flotante
            float numUno = Float.parseFloat(vista.getNumUno());
            float numDos = Float.parseFloat(vista.getNumDos());

            //creando un objeto de tipo operacion = new       
            Operacion operacion = new Operacion(numUno, numDos);
            InterfazOperacion interfazOperacion = new Operaciones();
            float respuesta = interfazOperacion.sumar(operacion);

            vista.mostrar(respuesta);

        } catch (Exception e) {
            vista.mostrarError();
        }

    }
}
