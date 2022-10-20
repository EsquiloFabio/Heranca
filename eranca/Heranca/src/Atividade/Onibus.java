package Atividade;

public class Onibus extends Veiculo {
	private int assentos;

	public Onibus(String tipo, String placa, int ano, int assentos) {
		super(tipo, placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	@Override
	void exibirDados(String placa, int ano) {	
		System.out.print("Veiculo=Onibus"+" Placa="+getPlaca()+" Ano="+getAno()+" Assentos="+getAssentos()+"\n");	
		
	}

}

