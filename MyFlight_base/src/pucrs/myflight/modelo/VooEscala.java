package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscala extends Voo{
    private Rota rotaFinal;

    public VooEscala(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao){
        super(rota,datahora,duracao);
        this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal(){
        return rotaFinal;
    }

    public String toString(){
        return super.toString() + "->" + getRotaFinal();
    }
}
