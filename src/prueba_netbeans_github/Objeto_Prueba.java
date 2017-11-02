
package prueba_netbeans_github;

public class Objeto_Prueba {
    /**
    Existen tres modificadores de visibilidad:
        public -> se puede llamar y ver desde cualquier lado.
        protected -> solo se podra ver en este packaje
        private -> solo se verá en esta clase.
    
    Los atributos deben ser siempre privados para que no se puedan modificar desde fuera.
    */
    private int peso_gramos;
    
    /**
    Los metodos deben controlar los atributos y asegurarse que son correctos.
    los metodos podran ser de la visibilidad que queramos
    */
    
    public void setPeso (int peso){
    
        /**
        Para acceder al atributo dentro de un metodo de un objeto debemos usar this
        ejemplo
               this.peso_gramos
    
        y para los parametros los usaremos indistintamente
        */
        
        this.peso_gramos = peso;
        
    }
    
    public int getPeso (){
        return peso_gramos;
    }
    
}
