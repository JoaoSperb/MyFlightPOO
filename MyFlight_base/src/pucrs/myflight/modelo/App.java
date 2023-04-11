package pucrs.myflight.modelo;


import java.time.Duration;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

		Geo g1 = new Geo(-29.9939,-51.1711);
		Aeroporto aeroporto1 = new Aeroporto("GRU","Algum aeroporto ai",g1);

		Geo g2 = new Geo(29.9939,51.1711);
		Aeroporto aeroporto2 = new Aeroporto("POA","Salgado filho",g2);

		CiaAerea ciaAerea1 = new CiaAerea("JJ","Tam");
		CiaAerea ciaAerea2 = new CiaAerea("BB","Gol");

		Aeronave aeronave1 = new Aeronave("745","Boeing 737-300",150);
		Aeronave aeronave2 = new Aeronave("247","Boeing 737-700",120);


		Rota r1 = new Rota(ciaAerea1,aeroporto1,aeroporto2,aeronave1);
		Rota r2 = new Rota(ciaAerea2,aeroporto2,aeroporto1,aeronave2);


		Voo voo1 = new Voo(r1, LocalDateTime.of(2023,7,15,12,00), Duration.ofHours(3));
		Voo voo2 = new Voo(r2,Duration.ofHours(3));
		Voo voo3 = new Voo(r2,LocalDateTime.of(2023,10,28,7,30),Duration.ofHours(3));

		GerenciadorAeronaves ga1 = new GerenciadorAeronaves();

		ga1.inserir(aeronave1);
		ga1.inserir(aeronave2);
		ga1.inserir("459","Boeing 737-300",150);
		System.out.println(ga1);
		System.out.println(ga1.pesquisar("459"));

		GerenciadorAeroportos geAeroPt = new GerenciadorAeroportos();
		geAeroPt.inserir(aeroporto1);
		geAeroPt.inserir(aeroporto2);
		geAeroPt.inserir("RJ","Aeroporto RJ",new Geo(28.7886,-24.9876));
		System.out.println(geAeroPt);
		System.out.println(geAeroPt.pesquisar("POA"));


		GerenciadorCias GCiaAerea = new GerenciadorCias();
		GCiaAerea.inserir(ciaAerea1);
		GCiaAerea.inserir(ciaAerea2);
		GCiaAerea.inserir("LOL","Beeps e Bops");
		System.out.println(GCiaAerea);
		System.out.println(GCiaAerea.pesquisarCodigo("LOL"));
		System.out.println(GCiaAerea.pesquisarNome("Tam"));


		GerenciadorRotas GRotas = new GerenciadorRotas();
		GRotas.inserir(r1);
		GRotas.inserir(r2);
		GRotas.inserir(ciaAerea1,aeroporto1,aeroporto2,aeronave1);
		System.out.println(GRotas);
		System.out.println(GRotas.pesquisarOrigem(aeroporto2));

		/*
		GerenciadorVoos GVoo = new GerenciadorVoos();
		GVoo.inserir(voo);
		GVoo.inserir(voo2);
		GVoo.inserir(r1, LocalDateTime.of(2023,5,10,17,00),Duration.ofHours(3));
		System.out.println(GVoo);
		System.out.println(GVoo.pesquisarData(LocalDateTime.of(2023,5,10,17,00)));

		Resolver o gerenciador de voos e o erro que ele da pedindo ajuda ao fran ou gian
		*/

		Geo geo1 = new Geo(-29.9942,-51.1714);
		Geo geo2 = new Geo(-23.4322,-46.4692);
		System.out.printf("A distancia entre o aeroporto salgado filho e o aeroporto de guarulhos é: (%.2f)",
				Geo.distancia(geo1,geo2));





	}
}
