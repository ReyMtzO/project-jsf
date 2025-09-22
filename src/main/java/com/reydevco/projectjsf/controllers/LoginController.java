package com.reydevco.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.reydevco.projectjsf.dto.UsuarioDTO;

/**
 * @author Rey David Martínez Olivares 
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {
	/**
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * Contraseña ingresada en el login
	 */
	private String password;
	
	/**
	 * Bean que mantiene la información en sesión
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	

	/**
	 * Método que permite ingresar a la pantalla principal del proyecto 
	 */
	
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		System.out.println("Contraseña: " + password);
		
		if (usuario.equals("reydevco") && password.equals("1234")) {
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	/**
	 * @return el usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario el usuario a establecer
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return el password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password el password a establecer
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}