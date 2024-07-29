package model;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public String tocar() {
		return "Tocando música...";
	}

	@Override
	public String pausar() {
		return "Música pausada!";
	}

	@Override
	public String selecionarMusica(String musica) {
		return "Música " + musica + " selecionada!";
	}

	@Override
	public String exibirPagina(String url) {
		return "Exibindo página " + url + " ...";
	}

	@Override
	public String adicionarNovaAba() {
		return "Nova aba adicionada!";
	}

	@Override
	public String atualizarPagina() {
		return "Atualizando página...";
	}

	@Override
	public String ligar(String numero) {
		return "Número " + numero + " ligando!";
	}

	@Override
	public String atender() {
		return "Atendendo ligação...";
	}

	@Override
	public String iniciarCorreioVoz() {
		return "Iniciando correio de voz...";
	}

}
