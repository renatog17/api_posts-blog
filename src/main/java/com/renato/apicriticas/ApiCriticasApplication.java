package com.renato.apicriticas;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.renato.apicriticas.domain.Post;
import com.renato.apicriticas.repository.PostRepository;

@SpringBootApplication

public class ApiCriticasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCriticasApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(PostRepository postRepository) {
		return args -> {
			Post post = new Post("A Jornada Épica dos Heróis", "cartazes/cartaz-a-jornada-epica-dos-herois.png", "A Jornada dos Heróis\", o tão aguardado filme fictício, é uma odisseia impressionante pelo mundo da imaginação que nos transporta para um universo repleto de magia, aventura e emoção. Dirigido com maestria por um talentoso cineasta, o longa-metragem cativa o público desde os primeiros minutos e o leva a uma jornada épica, repleta de reviravoltas e surpresas emocionantes.",
					Arrays.asList("aventura", "medieval"));
			Post post2 = new Post("Aventura nas Estrelas", "cartazes/cartaz-aventura-nas-estrelas.png", "Aventura nas Estrelas\" é um filme que nos leva a uma jornada intergaláctica emocionante e repleta de maravilhas além da nossa imaginação. Dirigido com maestria, o filme cativa desde o primeiro momento com seus efeitos visuais impressionantes, atuações brilhantes e um enredo envolvente que nos transporta para um universo vasto e cheio de mistérios.",
					Arrays.asList("aventura", "ficção"));
			Post post3 = new Post("No Limite da Realidade", "cartazes/cartaz-no-limite-da-realidade.png", "No Limite da Realidade\" é uma obra cinematográfica que desafia os limites da imaginação, transportando o espectador para um mundo fantástico e misterioso. Dirigido com maestria, o filme nos leva a uma viagem inesquecível, explorando temas complexos e surpreendentes que mantêm o público intrigado do início ao fim.",
					Arrays.asList("romance"));
			Post post4 = new Post("No Palco da Sétima Arte", "cartazes/cartaz-no-palco-da-setima-arte.png", "\"No Palco da Sétima Arte\" é um filme encantador que nos convida a entrar nos bastidores da sétima arte e mergulhar em um mundo de imaginação e criatividade. Dirigido com maestria, o filme nos presenteia com uma história envolvente que nos leva a conhecer os desafios e as paixões que permeiam a indústria cinematográfica.",
					Arrays.asList("musical", "romance"));
			Post post5 = new Post("A Jornada Épica dos Heróis", "cartazes/cartaz-a-jornada-epica-dos-herois.png", "A Jornada dos Heróis\", o tão aguardado filme fictício, é uma odisseia impressionante pelo mundo da imaginação que nos transporta para um universo repleto de magia, aventura e emoção. Dirigido com maestria por um talentoso cineasta, o longa-metragem cativa o público desde os primeiros minutos e o leva a uma jornada épica, repleta de reviravoltas e surpresas emocionantes.",
					Arrays.asList("aventura", "medieval"));
			Post post6 = new Post("Aventura nas Estrelas", "cartazes/cartaz-aventura-nas-estrelas.png", "Aventura nas Estrelas\" é um filme que nos leva a uma jornada intergaláctica emocionante e repleta de maravilhas além da nossa imaginação. Dirigido com maestria, o filme cativa desde o primeiro momento com seus efeitos visuais impressionantes, atuações brilhantes e um enredo envolvente que nos transporta para um universo vasto e cheio de mistérios.",
					Arrays.asList("aventura", "ficção"));
			Post post7 = new Post("No Limite da Realidade", "cartazes/cartaz-no-limite-da-realidade.png", "No Limite da Realidade\" é uma obra cinematográfica que desafia os limites da imaginação, transportando o espectador para um mundo fantástico e misterioso. Dirigido com maestria, o filme nos leva a uma viagem inesquecível, explorando temas complexos e surpreendentes que mantêm o público intrigado do início ao fim.",
					Arrays.asList("romance"));
			Post post8 = new Post("No Palco da Sétima Arte", "cartazes/cartaz-no-palco-da-setima-arte.png", "\"No Palco da Sétima Arte\" é um filme encantador que nos convida a entrar nos bastidores da sétima arte e mergulhar em um mundo de imaginação e criatividade. Dirigido com maestria, o filme nos presenteia com uma história envolvente que nos leva a conhecer os desafios e as paixões que permeiam a indústria cinematográfica.",
					Arrays.asList("musical", "romance"));
			postRepository.saveAll(Arrays.asList(post, post2, post3, post4, post5, post6, post7, post8));
		};
	}
}
