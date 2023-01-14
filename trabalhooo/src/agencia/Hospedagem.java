package agencia;

public class Hospedagem {
	
	private String nome;
	private date dataentrada;
	private date dataSaida;
	private int estrelas;
	private int type;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public date getDataentrada() {
		return dataentrada;
	}
	public void setDataentrada(date dataentrada) {
		this.dataentrada = dataentrada;
	}
	public date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	

}
