/**
 * 
 */
package com.rafael.SpringConAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rafael
 *
 */
@Component
public class ComercialExperimentado implements IEmpledo {
	
//	private IInfomeFinaciero nuevoInfome;
//	
//	//autowired con Contructor
//	
//	@Autowired
//	public ComercialExperimentado(IInfomeFinaciero nuevoInfome) {
//		super();
//		this.nuevoInfome = nuevoInfome;
//	}
//	
//	//autowired con setter o cualquier metodo
//	
//	@Autowired
//	public void setNuevoInfome(IInfomeFinaciero nuevoInfome) {
//		this.nuevoInfome = nuevoInfome;
//	}
	

	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private IInfomeFinaciero nuevoInfome;
	@Value("${email}")
	private String Email;
	@Value("${nombreEmpresa}")
	private String NombreEmpresa;
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return this.nuevoInfome.getInformeFinaciaero();
	}
	
	@PostConstruct
	private void setPostConstruct1() {
		System.out.println("Inicio de bean Comercial");
	}
	
	@PreDestroy
	private void setPreDestroy() {
		System.out.println("Cierre de la base de datos");
	}

	public String getEmail() {
		return Email;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

}
