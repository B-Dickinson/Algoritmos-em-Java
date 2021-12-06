package questao63;

public class Questao63 {
    
      public static void main(String[] args) {
            Produto p[] = new Produto[5]; 
            
            p[0] = new Produto("Carrinho",10f);
            p[1] = new Produto("Mochila",50f);
            p[2] = new Produto("Celular",1000f);
            p[3] = new Produto("Skate",450f);
            p[4] = new Produto("Playstation",5000f);
            
            Pedido pe = new Pedido(p[1],5);
            
            pe.pagar(1);
            pe.status();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            p[1].status();
            
            
    }
    
}

/*


Identifique	 as	 classes	 e	 implemente	 um	 programa	 para	 a
seguinte	 especificação:	 “O	supermercado	 vende	 diferentes	 tipos	 de	 produtos.
Cada	 produto	 tem	 um	 preço	 e	 uma	
quantidade	em	estoque.

Um	pedido	de	um	cliente	é	composto	de	itens,	onde	cada	item	
especifica	o	produto	que	o	cliente	deseja	e	a	respectiva	quantidade.
Esse	pedido	pode	ser	pago	em	dinheiro,	cheque	ou	cartão.”


*/
