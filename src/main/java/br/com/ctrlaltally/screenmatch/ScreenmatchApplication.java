package br.com.ctrlaltally.screenmatch;

import model.DadosEpisodio;
import model.DadosSerie;
import model.DadosTemporada;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ConsumoAPI;
import service.ConverteDados;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class ScreenmatchApplication implements CommandLineRunner    {

	public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        var consumoAPI = new ConsumoAPI();

        var json = consumoAPI.obterDados("https://omdbapi.com/?t=Arcane&apikey=966897e1");
        System.out.println(json);
        ConverteDados conversor = new ConverteDados();

        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        json = consumoAPI.obterDados("https://omdbapi.com/?t=Arcane&Season=1&episode=1&apikey=966897e1");
        DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
        System.out.println(dadosEpisodio);

        List<DadosTemporada> listaTemporadas = new ArrayList<>();

        for (int i = 1; i<= dadosSerie.totalTemporadas(); i++) {
            json = consumoAPI.obterDados("https://omdbapi.com/?t=Arcane&Season=" + i + "&apikey=966897e1");
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            listaTemporadas.add(dadosTemporada);
        }
        listaTemporadas.forEach(System.out::println);
    }
}
