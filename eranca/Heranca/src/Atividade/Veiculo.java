package Atividade;

public abstract class Veiculo {
	private String tipo;
	private String placa;
	private int ano;	
	
	public Veiculo(String tipo, String placa, int ano) {
		super();
		this.tipo = tipo;
		this.placa = placa;
		this.ano = ano;
	}
	
	public Veiculo() {
		super();
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	abstract void exibirDados(String placa,int ano);

}
