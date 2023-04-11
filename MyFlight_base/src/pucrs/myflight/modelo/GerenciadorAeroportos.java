package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void inserir(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public void inserir(String codigo,String nome,Geo loc){
        aeroportos.add(new Aeroporto(codigo,nome,loc));

    }

    public Aeroporto pesquisar(String codigo){
        for(Aeroporto aeroporto : aeroportos){
            if(aeroporto.getCodigo()==codigo){
                return aeroporto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder("\nGerenciador de Aeroportos\n- - - - - - - - - - -\n");
        for (Aeroporto umAeroporto : aeroportos) {
            aux.append( umAeroporto.toString() + "\n");
        }
        return aux.toString();

    }
}
