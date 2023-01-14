package agencia;

public class AluguelCarro {
	
	private String MNodelo;
	private date dataInicio;
	private date dataFinal;
	private String placa;
	
	public String getMNodelo() {
		return MNodelo;
	}
	public void setMNodelo(String mNodelo) {
		MNodelo = mNodelo;
	}
	public date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
