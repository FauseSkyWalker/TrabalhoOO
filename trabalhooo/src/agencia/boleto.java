package agencia;

public class boleto {
	
	private int codigo;
	private date data; 
	private date validade;
	private String banco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public date getData() {
		return data;
	}
	public void setData(date data) {
		this.data = data;
	}
	public date getValidade() {
		return validade;
	}
	public void setValidade(date validade) {
		this.validade = validade;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	

}
