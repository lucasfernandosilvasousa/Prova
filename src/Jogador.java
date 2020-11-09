
public class Jogador {
    private String nome;
    private int idade;
    private String vulgo;

    public Jogador(String nome, int idade, String vulgo) {
        this.nome = nome;
        this.idade = idade;
        this.vulgo = vulgo;
        
}
 public String getNome() {
     return this.nome;   
}

public int getIdade() {
    return this.idade;
}

public String getVulgo() {
    return this.vulgo;
  }


 public void setNome(String nome) {
      this.nome = nome;  
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setVulgo(String vulgo) {
    this.vulgo = vulgo;
  }
  public void derrota() {
      System.out.println("O jogador está perdendo");
      calcularKills();
  }
  public void desistir() {
      System.out.println("desistiu da patida");
  }
  public void gerarPlacar() {
      System.out.println("O jogador ganhou 2 vezes");
  }
  private void calcularKills() {


  }
}

