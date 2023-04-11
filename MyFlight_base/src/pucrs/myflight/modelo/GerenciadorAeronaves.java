package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void inserir(Aeronave aeronave){
        aeronaves.add(aeronave);
    }
    public void inserir(String codigo,String descricao,int capacidade){
        aeronaves.add(new Aeronave(codigo,descricao,capacidade));
    }

    public Aeronave pesquisar(String codigo){
        for(Aeronave aero: aeronaves){
            if (aero.getCodigo() == codigo){
                return aero;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder("\nGerenciador de Aeronaves\n- - - - - - - - - - -\n");
        for (Aeronave umaAeronave : aeronaves) {
            aux.append( umaAeronave.toString() + "\n");
        }
        return aux.toString();

    }

}
