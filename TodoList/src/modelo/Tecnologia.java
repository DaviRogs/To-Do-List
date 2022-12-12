package modelo;

public class Tecnologia {

	private String nomeTecnologia;

	private String descricaoTecnologia;

	public Tecnologia(String nomeT) {
		this.nomeTecnologia = nomeT;
	}

	public void editarTecnologia(String noT, String descT) {
		this.nomeTecnologia = noT;
		this.descricaoTecnologia = descT;
	}

	public String deletarTecnologia() {
		return ("Tecnologia deletado com sucesso!");
	}

	public String getTecnologia() {
		return (this.nomeTecnologia);
	}
}
