package com.osdepym.dto;

import java.sql.Timestamp;

public class AfiliadoDTO {
	int registroID;
	String obraSocial;
	String tipoCarga;
	String tipoAfiliado;
	Long cuit;
	Long cuil;
	String apellido;
	String nombre;
	String tipoDocumento;
	String nroDocumento;
	String direccion;
	String direccionNumero;
	String direccionPiso;
	String direccionDepartamento;
	String direccionLocalidad;
	String direccionProvincia;
	String codigoPostal;
	String telefono;
	String email;
	Timestamp fechaNacimiento;
	String sexo;
	String estadoCivil;
	Long cuilTitular;
	Timestamp fechaInicio;
	String centroMedico;
	String plan;
	String estado;
	Integer solicitudID;
	String archivo;
	Timestamp fechaCarga;
	Integer codigoError;
	String descripcionError;
	Integer estadoRegistroID;
	Integer obraSocialID;
	Integer tipoCargaID;
	Integer tipoAfiliadoID;
	Integer estadoCivilID;
	Integer provinciaID;
	Integer localidadID;
	boolean anular;
	   
	public AfiliadoDTO() {}

	public int getRegistroID() {
		return registroID;
	}

	public void setRegistroID(int registroID) {
		this.registroID = registroID;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public String getTipoAfiliado() {
		return tipoAfiliado;
	}

	public void setTipoAfiliado(String tipoAfiliado) {
		this.tipoAfiliado = tipoAfiliado;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public Long getCuil() {
		return cuil;
	}

	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionNumero() {
		return direccionNumero;
	}

	public void setDireccionNumero(String direccionNumero) {
		this.direccionNumero = direccionNumero;
	}

	public String getDireccionPiso() {
		return direccionPiso;
	}

	public void setDireccionPiso(String direccionPiso) {
		this.direccionPiso = direccionPiso;
	}

	public String getDireccionDepartamento() {
		return direccionDepartamento;
	}

	public void setDireccionDepartamento(String direccionDepartamento) {
		this.direccionDepartamento = direccionDepartamento;
	}

	public String getDireccionLocalidad() {
		return direccionLocalidad;
	}

	public void setDireccionLocalidad(String direccionLocalidad) {
		this.direccionLocalidad = direccionLocalidad;
	}

	public String getDireccionProvincia() {
		return direccionProvincia;
	}

	public void setDireccionProvincia(String direccionProvincia) {
		this.direccionProvincia = direccionProvincia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Long getCuilTitular() {
		return cuilTitular;
	}

	public void setCuilTitular(Long cuilTitular) {
		this.cuilTitular = cuilTitular;
	}

	public Timestamp getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCentroMedico() {
		return centroMedico;
	}

	public void setCentroMedico(String centroMedico) {
		this.centroMedico = centroMedico;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getSolicitudID() {
		return solicitudID;
	}

	public void setSolicitudID(Integer solicitudID) {
		this.solicitudID = solicitudID;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public Timestamp getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(Timestamp fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	public Integer getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(Integer codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	public Integer getEstadoRegistroID() {
		return estadoRegistroID;
	}

	public void setEstadoRegistroID(Integer estadoRegistroID) {
		this.estadoRegistroID = estadoRegistroID;
	}

	public Integer getObraSocialID() {
		return obraSocialID;
	}

	public void setObraSocialID(Integer obraSocialID) {
		this.obraSocialID = obraSocialID;
	}

	public Integer getTipoCargaID() {
		return tipoCargaID;
	}

	public void setTipoCargaID(Integer tipoCargaID) {
		this.tipoCargaID = tipoCargaID;
	}

	public Integer getTipoAfiliadoID() {
		return tipoAfiliadoID;
	}

	public void setTipoAfiliadoID(Integer tipoAfiliadoID) {
		this.tipoAfiliadoID = tipoAfiliadoID;
	}

	public Integer getEstadoCivilID() {
		return estadoCivilID;
	}

	public void setEstadoCivilID(Integer estadoCivilID) {
		this.estadoCivilID = estadoCivilID;
	}

	public Integer getProvinciaID() {
		return provinciaID;
	}

	public void setProvinciaID(Integer provinciaID) {
		this.provinciaID = provinciaID;
	}

	public Integer getLocalidadID() {
		return localidadID;
	}

	public void setLocalidadID(Integer localidadID) {
		this.localidadID = localidadID;
	}

	public boolean getAnular() {
		return anular;
	}

	public void setAnular(boolean anular) {
		this.anular = anular;
	}
}
