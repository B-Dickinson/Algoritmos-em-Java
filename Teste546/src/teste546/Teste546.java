
package teste546;

public class Teste546 {
    
    public static void main(String[] args) {
           int v[] = new int[4];
           int z[] = new int[3];
           int i;
           
        try{  
           if(v.length > z.length){
               throw new IndiceInvalido(v,z);
           }  
           for(i=0; i < z.length;i++){
               z[i] = 8;
           }
           
               System.out.println("");
               System.out.println("");
               
           for(i=0; i < v.length;i++){
               System.out.println(z[i]);
           }
        } catch(IndiceInvalido e){
               e.getMessage();
               e.printStackTrace();
              
        }
           
    }
}
