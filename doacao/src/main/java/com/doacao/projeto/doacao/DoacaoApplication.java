package com.doacao.projeto.doacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doacao.projeto.doacao.domain.Campanha;
import com.doacao.projeto.doacao.domain.Doacao;
import com.doacao.projeto.doacao.domain.Doador;
import com.doacao.projeto.doacao.domain.Ong;
import com.doacao.projeto.doacao.repositories.CampanhaRepository;
import com.doacao.projeto.doacao.repositories.DoacaoRepository;
import com.doacao.projeto.doacao.repositories.DoadorRepository;
import com.doacao.projeto.doacao.repositories.OngRepository;

@SpringBootApplication
public class DoacaoApplication implements CommandLineRunner {

	@Autowired
	private DoacaoRepository doacaoRepository;

	@Autowired
	private DoadorRepository doadorRepository;

	@Autowired
	private CampanhaRepository campanhaRepository;

	@Autowired
	private OngRepository ongRepository;

	public static void main(String[] args) {
		SpringApplication.run(DoacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doacao doa = new Doacao(null, "Toninho", "Boleto", 9.0);
		Doacao doa1 = new Doacao(null, "Toninho1", "Boleto", 6.0);
		Doacao doa2 = new Doacao(null, "Toninho2", "Cartão", 5.0);
		
		Doador d = new Doador(null, "Doador", "RG", "RG", "999999", "23/05/2023", "Ativo");
		Doador d1 = new Doador(null, "Doador1", "RG", "RG", "999999", "23/05/2023", "Inativo");
		Doador d2 = new Doador(null, "Doador2", "RG", "RG", "999999", "23/05/2023", "Ativo");
		
		Campanha c = new Campanha(null, "knsfsjnfd", "lknfkwnf", "lksdnfsndofns", "lkdnsfjksnfd","kamfaksnfs","lmslmdfos");
		Campanha c1 = new Campanha(null, "knsfsjnfd", "lknfkwnf", "lksdnfsndofns", "lkdnsfjksnfd","kamfaksnfs","lmslmdfos");
		Campanha c2 = new Campanha(null, "knsfsjnfd", "lknfkwnf", "lksdnfsndofns", "lkdnsfjksnfd","kamfaksnfs","lmslmdfos");
		
		Ong o = new Ong(null, "smflmksfdskdfm", "smdgldsndgs", "sfnnkdnjfks", "kjnsjkjdns", "skkdnfksjdfns");
		Ong o1 = new Ong(null, "smflmksfdskdfm", "smdgldsndgs", "sfnnkdnjfks", "kjnsjkjdns", "skkdnfksjdfns");
		Ong o2 = new Ong(null, "smflmksfdskdfm", "smdgldsndgs", "sfnnkdnjfks", "kjnsjkjdns", "skkdnfksjdfns");
		
		doacaoRepository.saveAll(Arrays.asList(doa,doa1,doa2));
		doadorRepository.saveAll(Arrays.asList(d,d1,d2));
		campanhaRepository.saveAll(Arrays.asList(c,c1,c2));
		ongRepository.saveAll(Arrays.asList(o,o1,o2));

	}

}
