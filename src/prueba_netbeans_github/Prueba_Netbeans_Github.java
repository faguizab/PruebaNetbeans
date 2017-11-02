package prueba_netbeans_github;

//@author fagui

public class Prueba_Netbeans_Github {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double nota;
        int trimestre;
        Notas expediente;
        
        expediente = new Notas ();
        
        System.out.println("Por favor, introduce el trimestre a valorar");
        trimestre = Entrada.entero();
        
        System.out.println("Por favor, introduce la nota del trimestre "+trimestre);
        nota = Entrada.realDoble();
        
        expediente.establecerNotas(nota, trimestre);
        
    }
    
}
