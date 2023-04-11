package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(Rota rota,Duration duracao){
		this.rota = rota;
		this.duracao = duracao;
	}


	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}

	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	@Override
	public String toString() {
		return String.format("(%f) \t %f \t %d",datahora,duracao,rota);
		//return String.format("(%f) \t %f \t %d",datahora,duracao,rota.getOrigem(),rota.getOrigem());
		//resolver esse problema do tostring com o gian e o fran

	}
}
