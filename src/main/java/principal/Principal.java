package principal;

import model.DadosSerie;
import service.ConsumoAPI;
import service.ConverteDados;

import java.util.Scanner;

public class Principal {

    private Scanner leitor = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=966897e1";

    public void exibeMenu() {
        System.out.println("Digite o nome da série: ");
        var serieEscolhida = leitor.nextLine();
        var json = consumo.obterDados(ENDERECO + serieEscolhida.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);
    }
}
