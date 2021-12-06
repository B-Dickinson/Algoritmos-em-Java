package teste3;

public class Teste3 {
    
public static void main(String[] args) {
           int m[][] = new int [5][5];
           int sl[] = new int[5];
           int sc[] = new int[5];
           int i;
           int j;
           int linha = 0;
           int coluna = 0;
          
for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        m[i][j] = (int)(1 + (Math.random()) * (8-1));
    }
}           


// somaL

for(i=0; i < m.length; i++){
    for(j=0; j < m[i].length; j++){
        
        linha = i;
        coluna = j;
        
        if(i == linha){
            sl[i] += m[i][j]; 
        }
        if(j == coluna){
            sc[j] += m[i][j];
        }
        
        System.out.print(m[i][j]+"\t");
    }
        System.out.println("\n");
}   


// imprimindo as soma do vetor de linha
    System.out.println("Soma Linha:");
    System.out.println("");

for(i=0; i < sl.length;i++){
    System.out.println(sl[i]);
}
    System.out.println("");
    System.out.println("");
    
// soma do vetor de coluna
    System.out.println("Soma Coluna:");
    System.out.println("");

for(j=0; j < sl.length;j++){
    System.out.println(sc[j]);
}
    


    }    
}

/*

Escrever um algoritmo que lê uma matriz M(5,5) e cria 2 vetores SL(5), SC(5) que 
contenham respectivamente as somas das linhas e das colunas de M. Escrever a matriz 
e os vetores criados.

*/
