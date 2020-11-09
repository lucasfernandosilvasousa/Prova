public class Principal {
public static void main(String[] args) {
    Jogador jogador = new Jogador("Lucas", 23, "Antivirus");
    System.out.println("Nome: "+jogador.getNome());
    System.out.println("Idade: " +jogador.getIdade());
    System.out.println("Vulgo: "+jogador.getVulgo());
    jogador.desistir();
    jogador.derrota();
    jogador.gerarPlacar();

    Jogo jogo = new Jogo("Pubg", "Rpg", "BattleRoyale");
    System.out.println("Jogo: "+jogo.getNome());
    System.out.println("Tipo: "+jogo.getTipo());
    System.out.println("Classe: "+jogo.getClasse());
    jogo.desinstalar();
    jogo.jogo();
    jogo.partida();

    Campeonato campeonato = new Campeonato("LigaPubg", "Profissional","Brasil");
    System.out.println("Campeonato: "+campeonato.getNome());
    System.out.println("Modalidade: "+campeonato.getModalidade());
    System.out.println("País: "+campeonato.getPais());
    campeonato.campeonato();
    campeonato.região();
    campeonato.vencedor();

    
}
}
