
package espoch.edu.ec.primermvc.vista;

import espoch.edu.ec.primermvc.controlador.ControladorOperaciones;

public class Vista {
    //mostar y tenemos dos metodos
    
    ControladorOperaciones controlador = new ControladorOperaciones();
    
    public  String getNumUno(){
        return "5";
    }
    
    public  String getNumDos(){
        return "6";
    }
  
    
    public void mostrar(float respuesta){
        
        System.out.println("LA RESPUESTA ES: "+respuesta);
    }
    
    public void mostrarError(){
        
        System.out.println("ERROR..  ");
    }
    
    public void enviar(){
        controlador.controlarOperacion();
    
    }
    
    
}
