package com.eletrodev.representation.model;

import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public class ToolModel {
	private Long id;
	private String codigo;
	private String pn;
	private String sn;
	private String nomenclatura;
	private String fabricante;
	
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
	
	//Overrride HashCode and Equals method
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
		ToolModel other = (ToolModel) obj;
		return Objects.equals(id, other.id);
	}
	
	//Override toString method
	@Override
	public String toString() {
		return "ToolModel [id=" + id + ", codigo=" + codigo + ", pn=" + pn + ", sn=" + sn + ", nomenclatura="
				+ nomenclatura + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
}
