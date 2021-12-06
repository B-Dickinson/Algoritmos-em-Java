package matematica;


public class Ex004 {
   
public static void main(String[]args){
       int a[][] = new int[2][3];
       int b[][] = new int[3][2];
       int r[][] = new int[2][2];
       int i;
       int j;

       a[0][0] = 1; 
       a[0][1] = 4; 
       a[0][2] = 0; 
       a[1][0] = 1; 
       a[1][1] = -3; 
       a[1][2] = 1;
       
       b[0][0] = 1;
       b[0][1] = -1;
       b[1][0] = -1;
       b[1][1] = 1;
       b[2][0] = 5;
       b[2][1] = 0;

       
       r[0][0] = ((a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0])); 
       r[0][1] = ((a[0][0] * b[0][1]) + (a[0][1] * b[1][1]) + (a[0][2] * b[2][1]));   

       r[1][0] = ((a[1][0] * b[0][0]) + (a[1][1] * b[1][0]) + (a[1][2] * b[2][0])); 
       r[1][1] = ((a[1][0] * b[0][1]) + (a[1][1] * b[1][1]) + (a[1][2] * b[2][1])); 


       System.out.println(r[0][0]);
       

               System.out.println("Matriz A:");
               System.out.println("");
       
       for(i=0; i < a.length;i++){
            for(j=0; j < a[i].length; j++){
               System.out.print(a[i][j]+"\t");
            }
               System.out.println("\n");
       }
               System.out.println();
               System.out.println();

               System.out.println("Matriz B:");
               System.out.println("");

        for(i=0; i < b.length;i++){
            for(j=0; j < b[i].length; j++){
                    System.out.print(b[i][j]+"\t");
            }
                    System.out.println("\n");
        }
      
                    System.out.println("Matriz R:");
                    System.out.println();
        for(i=0; i < r.length;i++){
            for(j=0; j < r[i].length; j++){
                System.out.print(r[i][j]+"\t");
        }
                System.out.println("\n");
        }      
        


}    
}

/* 

Considerando as matrizes A e B, calcule o produto de A * B

     1  4  0
A =  1 -3  1
    
   
      1  -1
B =  -1   1
      5   0  
*/
