
package prueba_netbeans_github;

// @author fagui

public class Notas {
    private double nota1, nota2, nota3;
    
    public Notas(){
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    }
    public void establecerNotas (double nota, int trimestre){
        if (nota >=0 && nota<=10){
            switch (trimestre) {
                case 1: this.nota1 = nota;
                        break;
                case 2: this.nota2 = nota;
                        break;
                case 3: this.nota3 = nota;
                        break;
                default:break;
            }
        }else{
            System.out.println("La nota introducida es erronea");
        }
    }
    public double saberNotaMedia (){
        return (this.nota1+this.nota2+this.nota3)/3;
    }
    
}
