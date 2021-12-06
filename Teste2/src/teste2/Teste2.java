package teste2;

public class Teste2 {

    public static void main(String[] args) {
           int m[][] = new int[5][5];
           int i;
           int j;
           int soma = 0;
           int somaDp = 0;
           int somaDs = 0;
           int somaL = 0;
           int somaC = 0;
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        m[i][j] = (int)(1 + (Math.random() * (8-1)));
    }
}
                   System.out.println(""); 
                   System.out.println("Matriz M:"); 
                   System.out.println(""); 

for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        System.out.print(m[i][j]+"\t");
    }
        System.out.println("\n");
}

            // soma linha 4

for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        if(i == 4){
            somaL += m[i][j];
        }
    }
} 
           // soma coluna 2 
            
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        if(j == 2){
            somaC += m[i][j];
        }
    }
}  

            // soma diagonal principal
            
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        if(i == j){
            somaDp += m[i][j];
        }
    }
}  


            // soma diagonal secundaria
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        if(i + j == 4){
            somaDs += m[i][j];
        }
    }
}  

           // soma total
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        soma += m[i][j];
    }
        System.out.println("\n");
}  
        
        System.out.println("");
        System.out.println("a) r: "+somaL);
        System.out.println("b) r: "+somaC);
        System.out.println("c) r: "+somaDp);
        System.out.println("d) r: "+somaDs);
        System.out.println("e) r: "+soma);





    }
}

/*

Escreva um algoritmo que leia uma matriz M(5,5) e calcula as somas:
a) da linha 4 de M.
b) da coluna 2 de M.
c) da diagonal principal.
d) da diagonal secundária.
e) de todos os elementos da matriz.
f) Escreva estas somas e a matriz.

*/
