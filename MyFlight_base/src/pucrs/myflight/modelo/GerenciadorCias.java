package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}
	public void inserir(CiaAerea ciaAerea){
		empresas.add(ciaAerea);
	}
	public void inserir(String codigo,String nome){
		empresas.add(new CiaAerea(codigo,nome));

	}
	public CiaAerea pesquisarCodigo(String codigo){
		for(CiaAerea ciaAerea:empresas){
			if(ciaAerea.getCodigo() == codigo){
				return ciaAerea;
			}
		}
		return null;
	}

	public CiaAerea pesquisarNome(String nome){
		for(CiaAerea ciaAerea : empresas){
			if(ciaAerea.getNome()==nome){
				return ciaAerea;
			}
		}
		return null;

	}
	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder("\nGerenciador de Cias Aéreas\n- - - - - - - - - - -\n");
		for (CiaAerea umaCiaAerea : empresas) {
			aux.append( umaCiaAerea.toString() + "\n");
		}
		return aux.toString();

	}
}
