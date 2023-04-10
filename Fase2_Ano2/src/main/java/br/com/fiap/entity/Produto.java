package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

	@Id
	@SequenceGenerator(name="produto", sequenceName = "sq_tb_produto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name = "id_produto")
	private int id;
	
	@Column(name = "tp_produto", nullable = false, length = 50)
	private String produto;
	
	@Column(name = "vl_preco", nullable = false)
	private double preco;
	
	@OneToOne
	@JoinColumn(name = "TB_PRODUTO_TB_USUARIO_FK")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "produto")
	private List<Cliente> clientes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(int id, String produto, double preco) {
		super();
		this.id = id;
		this.produto = produto;
		this.preco = preco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
