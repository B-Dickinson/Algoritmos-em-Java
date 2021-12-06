package matematica;

public class Ex002{

public static void main(String[]args){

int a[][] = new int[2][3];
int i;
int j;

for(i=0; i < a.length;i++){
   for(j=0; j < a[i].length; j++){
      a[i][j] = (int)(3 * (Math.pow(i,2) - j)); 
   }
}
System.out.println();
System.out.println(" Matriz A=");
System.out.println();

for(i=0; i < a.length; i++){
   for(j=0; j < a[i].length; j++){
       System.out.print(a[i][j]+"\t");   
   }
       System.out.println("\n");  
}
      
      
    
   }   
} 

/*

Construa uma matriz A de ordem 2 x 3 formada por elementos do tipo:

a[i][j] = 3i^2 - j

*/
