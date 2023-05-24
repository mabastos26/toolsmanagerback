package com.eletrodev.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ferramenta")
public class Tool {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Size(max=20)
	private String codigo;
	@Size(max=20)
	private String pn;
	@Size(max=20)
	private String sn;
	@NotBlank
	@Size(max=50)
	private String nomenclatura;
	@Size(max=30)
	private String fabricante;
	/*private Boolean calibravel;
	private OffsetDateTime dataCadastro;
	@Size(max=5)
	private Long quantidade;
	@Size(max=10)
	@ManyToOne
	private Tool compoeFerramenta;
	@Size(max=10)
	@OneToOne
	private Localization localizacao;*/
	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getNomenclatura() {
		return nomenclatura;
	}
	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/*public Boolean getCalibravel() {
		return calibravel;
	}
	public void setCalibravel(Boolean calibravel) {
		this.calibravel = calibravel;
	}
	public OffsetDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(OffsetDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Tool getCompoeFerramenta() {
		return compoeFerramenta;
	}
	public void setCompoeFerramenta(Tool compoeFerramenta) {
		this.compoeFerramenta = compoeFerramenta;
	}
	public Localization getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localization localizacao) {
		this.localizacao = localizacao;
	}*/
	
	//Override the hashCode and Equals methods
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tool other = (Tool) obj;
		return Objects.equals(id, other.id);
	}
	

}
