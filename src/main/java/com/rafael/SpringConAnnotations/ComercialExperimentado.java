/**
 * 
 */
package com.rafael.SpringConAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rafael
 *
 */
@Component
public class ComercialExperimentado implements IEmpledo {
	
	private IInfomeFinaciero nuevoInfome;
	
	//autowired con Contructor
	
	@Autowired
	public ComercialExperimentado(IInfomeFinaciero nuevoInfome) {
		super();
		this.nuevoInfome = nuevoInfome;
	}
	
//	//autowired con setter o cualquier metodo
//	
//	@Autowired
//	public void setNuevoInfome(IInfomeFinaciero nuevoInfome) {
//		this.nuevoInfome = nuevoInfome;
//	}
//
//	@Autowired 
//	private IInfomeFinaciero nuevoInfome;
	
	
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
	
	

}
