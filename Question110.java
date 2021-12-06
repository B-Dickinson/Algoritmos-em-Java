package matematica;

public class Ex010{

public static void main(String[]args){
       int c[][] = new int[2][2];
       int d[][] = new int [2][2];
       int i;
       int j;
       int dpC = 1;
       int dsC = 1;
       int dpD = 1;
       int dsD = 1;
       int determinanteC = 0;
       int determinanteD = 0;

       c[0][0] = -2;
       c[0][1] =  3;
       c[1][0] =  6;
       c[1][1] =  1;

       d[0][0] = 3;
       d[0][1] = -8;
       d[1][0] = 4;
       d[1][1] = 0;
       
        System.out.println();
        System.out.println("Matriz C: ");
        System.out.println();
for(i=0; i < c.length; i++){
    for(j=0; j < c[i].length; j++){
        System.out.print(c[i][j]+"\t");
    }
        System.out.println("\n");
} 



        System.out.println();
        System.out.println("Matriz D:");
        System.out.println();
for(i=0; i < d.length; i++){
    for(j=0; j < d[i].length; j++){
        System.out.print(d[i][j]+"\t");
    }
        System.out.println("\n");
} 



for(i=0; i < c.length; i++){
    for(j=0; j < c[i].length; j++){
        if(i == j){
            dpC *= c[i][j];
        }
        if(i + j == 1){
            dsC *= c[i][j];
        }
    }
}   


for(i=0; i < d.length; i++){
    for(j=0; j < d[i].length; j++){
        if(i == j){
            dpD *= d[i][j];
        }
        if(i + j == 1){
            dsD *= d[i][j];
        }
    }
} 
            determinanteC += (dpC - dsC);
            determinanteD += (dpD - dsD);     


            System.out.println("Determinante de C: "+determinanteC);
            System.out.println("Determinante de D: "+determinanteD);
            System.out.println();


    }    
}

/* 

Calcule o determinante das matrizes C e D, abaixo:

c = -2 3
     6 1

d = 3 -8
    4  0


*/