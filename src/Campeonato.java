
public class Campeonato {
    private String nome;
    private String modalidade;
    private String pais;

    public Campeonato(String nome, String modalidade, String pais) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pais = pais;
        
}
 public String getNome() {
     return this.nome;   
}

public String getModalidade() {
    return this.modalidade;
}

public String getPais() {
    return this.pais;
  }


 public void setNome(String nome) {
      this.nome = nome;  
}

public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
}

public void setPais(String pais) {
    this.pais = pais;
  }
  public void campeonato() {
      System.out.println("Campeonato de pubg");
  }
  public void região() {
      System.out.println("South America ");
  }
  public void vencedor() {
      System.out.println("O jogador ganhou 2 vezes");
  }

  }
