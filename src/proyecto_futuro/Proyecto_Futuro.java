
package proyecto_futuro;

/*
 @autor Carlos Perez
 */

public class Proyecto_Futuro {

    public static void main(String[] args) {
        System.out.println ("Estudiante: " + args [0]);
        System.out.println ("Módulos matriculados: " + args [1]);
        System.out.println ("Horas de estudio dedicadas: " + args [2]);
        
        System.out.println(Proyecto_Futuro.veredicto(args[1],args[2]));
    }
    
   public static String veredicto(String valor1, String valor2) {
    if (valor1.equals(valor2)) {
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
    if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
    }
    return "Ideal. Trabajas los contenidos en casa.";
    }
}


