package agencia;

public class Passagem {
	
	private int NPedido;
	private int Acento;
	private float Preço;
	private date dia;
	
	public int getNPedido() {
		return NPedido;
	}
	public void setNPedido(int nPedido) {
		NPedido = nPedido;
	}
	public int getAcento() {
		return Acento;
	}
	public void setAcento(int acento) {
		Acento = acento;
	}
	public float getPreço() {
		return Preço;
	}
	public void setPreço(float preço) {
		Preço = preço;
	}
	public date getDia() {
		return dia;
	}
	public void setDia(date dia) {
		this.dia = dia;
	}
	
	
}
