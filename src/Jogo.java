
public class Jogo {
    private String nome;
    private String tipo;
    private String classe;

    public Jogo(String nome, String tipo, String classe) {
        this.nome = nome;
        this.tipo = tipo;
        this.classe = classe;
        
}
 public String getNome() {
     return this.nome;   
}

public String getTipo() {
    return this.tipo;
}

public String getClasse() {
    return this.classe;
  }


 public void setNome(String nome) {
      this.nome = nome;  
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public void setClasse(String classe) {
    this.classe = classe;
  }
  public void jogo() {
      System.out.println("O jogo é pesado");
  }
  public void desinstalar() {
      System.out.println("desinstalar o jogo");
  }
  public void partida() {
      System.out.println("quatro x quatro");
  }
 
 
}
    

