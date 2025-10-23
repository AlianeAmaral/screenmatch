package principal;

import service.ConsumoAPI;
import java.util.Scanner;

public class Principal {

    private Scanner leitor = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=966897e1";

    public void exibeMenu() {
        System.out.println("Digite o nome da série: ");
        var serieEscolhida = leitor.nextLine();
        var json = consumo.obterDados(ENDERECO + serieEscolhida.replace(" ", "+") + API_KEY);
    }
}
