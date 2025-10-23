package br.com.ctrlaltally.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;

@SpringBootApplication

public class ScreenmatchApplication implements CommandLineRunner    {

	public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();

//        List<DadosTemporada> listaTemporadas = new ArrayList<>();
//        for (int i = 1; i<= dadosSerie.totalTemporadas(); i++) {
//            json = consumoAPI.obterDados("https://omdbapi.com/?t=Arcane&Season=" + i + "&apikey=966897e1");
//            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//            listaTemporadas.add(dadosTemporada);
//        }
//        listaTemporadas.forEach(System.out::println);
    }
}
