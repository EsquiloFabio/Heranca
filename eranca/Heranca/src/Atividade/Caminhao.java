package Atividade;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao(String tipo, String placa, int ano, int eixos) {
		super(tipo, placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	void exibirDados(String placa, int ano) {
		System.out.print("Veiculo=Onibus"+" Placa="+getPlaca()+" Ano="+getAno()+" Assentos="+getEixos()+"\n");	
	}

}