/**
 * 
 */
package com.reydevco.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.reydevco.projectjsf.entity.Empleado;
import com.reydevco.projectjsf.services.EmpleadoService;

/**
 * @author Rey David Martínez Olivares
 * Clase controller que se encarga de procesar la información para la pantalla principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Lista de empleados filtrados
	 */
	private List<Empleado> empleadosFiltrados;
	
	
	/**
	 * Servicio con los métodos que realizan la lógica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Método que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Método que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

}
