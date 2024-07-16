package br.com.alura.cineplus;

import br.com.alura.cineplus.model.DadosSerie;
import br.com.alura.cineplus.service.ConsumoApi;
import br.com.alura.cineplus.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineplusApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CineplusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=3a4c61b2");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
