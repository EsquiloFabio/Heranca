package Atividade;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int cont;
		
		Caminhao cam=new Caminhao(null, null, 0, 0);
		Onibus bus=new Onibus(null, null, 0, 0);
		
		ArrayList<String> tipoArray=new ArrayList<String>();
		ArrayList<String> placaArray=new ArrayList<String>();
		ArrayList<Integer> anoArray=new ArrayList<Integer>();
		ArrayList<Integer> acessoriosArray=new ArrayList<Integer>();
		
		bus.setTipo("Onibus");
		tipoArray.add(bus.getTipo());
		bus.setPlaca("AAA-1111");
		placaArray.add(bus.getPlaca());
		bus.setAno(2000);
		anoArray.add(bus.getAno());
		bus.setAssentos(41);
		acessoriosArray.add(bus.getAssentos());
		bus.setTipo("Onibus");
		tipoArray.add(bus.getTipo());
		bus.setPlaca("ABC-1234");
		placaArray.add(bus.getPlaca());
		bus.setAno(2005);
		anoArray.add(bus.getAno());
		bus.setAssentos(45);
		acessoriosArray.add(bus.getAssentos());
		bus.setTipo("Onibus");
		tipoArray.add(bus.getTipo());
		bus.setPlaca("BBB-2222");
		placaArray.add(bus.getPlaca());
		bus.setAno(2010);
		anoArray.add(bus.getAno());
		bus.setAssentos(42);
		acessoriosArray.add(bus.getAssentos());
		bus.setTipo("Onibus");
		tipoArray.add(bus.getTipo());
		bus.setPlaca("CCC-3333");
		placaArray.add(bus.getPlaca());
		bus.setAno(2015);
		anoArray.add(bus.getAno());
		bus.setAssentos(43);
		acessoriosArray.add(bus.getAssentos());
		bus.setTipo("Onibus");
		tipoArray.add(bus.getTipo());
		bus.setPlaca("DDD-4444");
		placaArray.add(bus.getPlaca());
		bus.setAno(2020);
		anoArray.add(bus.getAno());
		bus.setAssentos(44);
		acessoriosArray.add(bus.getAssentos());
		
		cam.setTipo("Caminhao");
		tipoArray.add(cam.getTipo());
		cam.setPlaca("EFG-5678");
		placaArray.add(cam.getPlaca());
		cam.setAno(2022);
		anoArray.add(cam.getAno());
		cam.setEixos(9);
		acessoriosArray.add(cam.getEixos());
		cam.setTipo("Caminhao");
		tipoArray.add(cam.getTipo());
		cam.setPlaca("EEE-5555");
		placaArray.add(cam.getPlaca());
		cam.setAno(1982);
		anoArray.add(cam.getAno());
		cam.setEixos(2);
		acessoriosArray.add(cam.getEixos());
		cam.setTipo("Caminhao");
		tipoArray.add(cam.getTipo());
		cam.setPlaca("FFF-6666");
		placaArray.add(cam.getPlaca());
		cam.setAno(1992);
		anoArray.add(cam.getAno());
		cam.setEixos(3);
		acessoriosArray.add(cam.getEixos());
		cam.setTipo("Caminhao");
		tipoArray.add(cam.getTipo());
		cam.setPlaca("GGG-7777");
		placaArray.add(cam.getPlaca());
		cam.setAno(2002);
		anoArray.add(cam.getAno());
		cam.setEixos(4);
		acessoriosArray.add(cam.getEixos());
		cam.setTipo("Caminhao");
		tipoArray.add(cam.getTipo());
		cam.setPlaca("HHH-8888");
		placaArray.add(cam.getPlaca());
		cam.setAno(2012);
		anoArray.add(cam.getAno());
		cam.setEixos(7);
		acessoriosArray.add(cam.getEixos());
		
		
		
		for(cont=0;cont<=9;cont++) {
			if(cont<=4) {	
				System.out.println("Veiculo="+tipoArray.get(cont)+" Placa="+placaArray.get(cont)+" Ano="+anoArray.get(cont)
				+" Assentos="+acessoriosArray.get(cont));	
			}else {
				System.out.println("Veiculo="+tipoArray.get(cont)+" Placa="+placaArray.get(cont)+" Ano="+anoArray.get(cont)
				+" Eixos="+acessoriosArray.get(cont));	
			}
		}
	}
}

