package com.praxis.proyectoHospitalPost.model.dto;

import java.util.Date;

public class Paciente {

	private Integer id;
	private String nombre;
	private String apellido;
	private String rut;
	private Integer edad;
	private String enfermedad;	
	private String salaHospitalizacion;
	private Date fechaIngreso;
	
	public Paciente(Integer id, String nombre, String apellido, String rut, Integer edad, String enfermedad,
			String salaHospitalizacion, Date fechaIngreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.edad = edad;
		this.enfermedad = enfermedad;
		this.salaHospitalizacion = salaHospitalizacion;
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getSalaHospitalizacion() {
		return salaHospitalizacion;
	}

	public void setSalaHospitalizacion(String salaHospitalizacion) {
		this.salaHospitalizacion = salaHospitalizacion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", edad="
				+ edad + ", enfermedad=" + enfermedad + ", salaHospitalizacion=" + salaHospitalizacion
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
	
}
