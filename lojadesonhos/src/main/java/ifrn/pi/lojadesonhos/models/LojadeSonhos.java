package ifrn.pi.lojadesonhos.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LojadeSonhos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//gera o id automaticamente
	private Long id;
	private String cliente;
	private String valor;
	private String recheio;
	private String dataCompra;
	private String horarioCompra;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getHorarioCompra() {
		return horarioCompra;
	}

	public void setHorarioCompra(String horarioCompra) {
		this.horarioCompra = horarioCompra;
	}

	@Override
	public String toString() {
		return "LojadeSonhos [id=" + id + ", cliente=" + cliente + ", valor=" + valor + ", recheio=" + recheio
				+ ", dataCompra=" + dataCompra + ", horarioCompra=" + horarioCompra + "]";
	}

	

}
