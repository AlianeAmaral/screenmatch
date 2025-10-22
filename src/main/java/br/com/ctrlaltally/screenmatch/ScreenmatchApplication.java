package br.com.ctrlaltally.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ConsumoAPI;

@SpringBootApplication

public class ScreenmatchApplication implements CommandLineRunner    {

	public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://omdbapi.com/?t=Arcane&Season=1&apikey=966897e1");
        System.out.println(json);
    }
}
