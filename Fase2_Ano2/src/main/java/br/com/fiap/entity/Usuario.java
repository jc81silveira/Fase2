package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	@Id
	@SequenceGenerator(name="usuario", sequenceName = "sq_tb_usuario", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	@Column(name = "id_usuario")
	private int id;
	
	@Column(name = "nm_usuario", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "nr_cpf", nullable = false)
	private int cpf;
	
	@Column(name = "vl_saldo")
	private double saldo;
	
	@OneToOne(mappedBy = "usuario")
	private Produto produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario(int id, String nome, int cpf, double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
