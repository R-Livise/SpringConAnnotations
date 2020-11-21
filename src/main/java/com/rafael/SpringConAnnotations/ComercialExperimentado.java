/**
 * 
 */
package com.rafael.SpringConAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author rafael
 *
 */
@Component
@Scope("prototype")
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
	
//	@Qualifier("informeFinancieroTrim4")

	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private IInfomeFinaciero nuevoInfome;
	
	
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
	
//	@PostConstruct
//	private void setPostConstruct1() {
//		System.out.println("Inicion de bean Comercial1");
//	}
//	
//	@PostConstruct
//	private void postConstruct2() {
//		System.out.println("Inicion de bean Comercial2");
//	}
//	
//	@PostConstruct
//	private void theBestPostConstruct3() {
//		System.out.println("Inicion de bean Comercial3");
//	}
//	
//	
//	@PreDestroy
//	private void setPreDestroy() {
//		System.out.println("Cierre de la base de datos");
//	}
//	

}
