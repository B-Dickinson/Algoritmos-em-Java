package questao64;

public interface Agendinha {
      public abstract void adicionarContato(Contato c);
      public abstract void excluir(Contato c);
      public abstract void buscar(Contato c);
      public abstract void esvaziar();
      public abstract void ordenarDescrescente();
      
}
