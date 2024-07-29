package application;

import model.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println("Ações do reprodutor musical:");
		System.out.println(iphone.selecionarMusica("Oceano - Djavan"));
		System.out.println(iphone.tocar());
		System.out.println(iphone.pausar());

		System.out.println("\nAções do navegador de internet:");
		System.out.println(iphone.adicionarNovaAba());
		System.out.println(iphone.exibirPagina("www.google.com"));
		System.out.println(iphone.atualizarPagina());
		
		System.out.println("\nAções do aparelho telefônico:");
		System.out.println(iphone.ligar("21 999999999"));
		System.out.println(iphone.atender());
		System.out.println(iphone.iniciarCorreioVoz());
		
	}

}
