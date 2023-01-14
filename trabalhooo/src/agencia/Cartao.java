package agencia;

public class Cartao {
	
	private int Num;
	private String CVV
	private date validade;
	private String NomeNoCartao;
	private String CPFDono;
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public date getValidade() {
		return validade;
	}
	public void setValidade(date validade) {
		this.validade = validade;
	}
	public String getNomeNoCartao() {
		return NomeNoCartao;
	}
	public void setNomeNoCartao(String nomeNoCartao) {
		NomeNoCartao = nomeNoCartao;
	}
	public String getCPFDono() {
		return CPFDono;
	}
	public void setCPFDono(String cPFDono) {
		CPFDono = cPFDono;
	} 

	
}
