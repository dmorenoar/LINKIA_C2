/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_c2;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Company  comp = new Company("CITROEN", "LONDRES"); 
       //1- 
       Coche c2 = new Coche("C3", 120,comp);
       System.out.println(comp.getNombre());
       
       
       //2- 
       Coche c = new Coche("Celica", 230, new Company("TOYOTA", "JAPON"));
       //c.getCompany(A la clase coche) .getNombre(Clase Company)
       System.out.println(c.getCompany().getNombre());
       
       System.out.println(c);
       System.out.println(c2);
       
       System.out.println(c.getClass());
       System.out.println(comp.getClass());
       
       //No creo un coche nuevo
       Coche c4 = c;
       //Me da igual porque es una igualación entre objetos
       if(c4.equals(c)){
          System.out.println("son iguales");
        }else{
          System.out.println("no son iguales"); 
        }
      
       //Porque estan referenciados.
       c4.setModelo("Pepito");
       System.out.println(c.getModelo());
       
       
       //Control de excepciones
       try{
        //3
        Coche c3 = (Coche) c.clone();
        
        //Creo un nuevo objeto de Coche independiente del otro 
        if(c3.equals(c)){
          System.out.println("son iguales");
        }else{
          System.out.println("no son iguales"); 
        }
        
        c.setModelo("Corolla");
        
        /*Al tener definido el coche con modelo para ser iguales y cambiamos el nombre
        nos dice que no son iguales.
        */
        if(c3.equals(c)){
          System.out.println("son iguales");
        }else{
          System.out.println("no son iguales"); 
        }
        
        
       }catch(CloneNotSupportedException ex){
           System.out.println("no se pudo clonar");
       }
       
      
       System.out.println("Coches dados de alta en el sistema: " + Coche.getContador());
       
       Coche ex = new Coche();
       for(int i=0;i<1000;i++){
           ex = new Coche();
           //Forzamos a que el garbage collector libere memoria.
           System.gc();
           System.out.println(Coche.getContador());
       }
  
    }
    
}
