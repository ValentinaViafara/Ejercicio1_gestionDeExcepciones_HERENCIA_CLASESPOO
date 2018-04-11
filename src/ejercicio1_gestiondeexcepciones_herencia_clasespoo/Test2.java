
package ejercicio1_gestiondeexcepciones_herencia_clasespoo;


public class Test2 {

    public Test2() {
        divideByzero();
    }
    
    
    double divideByzero(){
        double result=0;
        
        try{
            result =25/0;
        }catch (ArithmeticException exception){
            System.out.println("Error Aritmético, no es podible dividir por Cero.");
        }
        
        return result;
    }
   
}
