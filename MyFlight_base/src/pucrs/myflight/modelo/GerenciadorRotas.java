package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }
    public void inserir(Rota rota){
        rotas.add(rota);
    }

    public void inserir(CiaAerea cia,Aeroporto origem,Aeroporto destino,Aeronave aeronave){
        rotas.add(new Rota(cia,origem,destino,aeronave));
    }

    public Rota pesquisarOrigem(Aeroporto aeroporto){
        for(Rota rota:rotas){
            if(rota.getOrigem() == aeroporto){
                return rota;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder("\nGerenciador de rotas\n- - - - - - - - - - -\n");
        for (Rota umaRota : rotas) {
            aux.append( umaRota.toString() + "\n");
        }
        return aux.toString();

    }
}
