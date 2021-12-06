package questao63;

public class Pedido  {
       private Produto p;
       private Produto q;
       private int qtd;
       private float total = 0;

    public Pedido(Produto p,int x) {
        this.p = p;
        this.total = 0;
        this.qtd = x;
        this.p.setQuantidade(this.p.getQuantidade() - this.qtd);
    }
    
    public void status(){
        System.out.println("Produto: "+this.p.getNome());
        System.out.println("Preco: "+this.p.getPreco());
        System.out.println("Quantidade: "+this.getQtd());
        System.out.println("Total: "+this.total);
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void formaPagamento(){
           System.out.println("----------------");
           System.out.println("1 - A vista");
           System.out.println("2 - Cheque");
           System.out.println("3 - Credito");
           System.out.println("----------------");
    }
    
    public void pagar(int x){
        float z = 0;
          switch(x){
              case 1:
                     z = ((this.p.getPreco() * qtd));
                     this.total = z - (this.p.getPreco() * 0.1f);
              break;
              case 2:
                     this.total = (this.p.getPreco() * qtd);
              break;
              case 3:
                     z = ((this.p.getPreco() * qtd));
                     this.total = z + (this.p.getPreco() * 0.1f);
              break;
              default:
                      System.out.println("Forma de pagamento inválida");
          }
    }   
    
}
