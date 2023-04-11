package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }
    public void inserir(Voo voo){
        voos.add(voo);
    }
    public void inserir(Rota rota,LocalDateTime dataHora, Duration duracao){
        voos.add(new Voo(rota,dataHora,duracao));
    }

    public Voo pesquisarData(LocalDateTime datahora){
        for(Voo voo : voos){
            if(voo.getDatahora()== datahora){
                return voo;
            }
        }
        //resolver o erro que ta dando com o gian ou o fran.
        return null;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder("\nGerenciador de Voos\n- - - - - - - - - - -\n");
        for (Voo umVoo : voos) {
            aux.append( umVoo.toString() + "\n");
        }
        return aux.toString();

    }
}
