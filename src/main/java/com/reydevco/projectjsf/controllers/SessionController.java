/**
 * 
 */
package com.reydevco.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.reydevco.projectjsf.dto.UsuarioDTO;

/**
 * @author Rey David Martínez Olivares
 * Clase que se encarga de mantener la información del usuario que ingresa al aplicativo en sesión
 */
@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendrá en sesión
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesión del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando información del usuario en la sesión...");
	}
	
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
