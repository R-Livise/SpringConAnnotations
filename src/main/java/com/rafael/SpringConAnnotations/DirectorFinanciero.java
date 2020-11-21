/**
 * 
 */
package com.rafael.SpringConAnnotations;

/**
 * @author rafael
 *
 */
public class DirectorFinanciero implements IEmpledo{
	
	private IInfomeFinaciero nuevoInforme;

	public DirectorFinanciero(IInfomeFinaciero nuevoInfome) {
		this.nuevoInforme = nuevoInfome;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return this.nuevoInforme.getInformeFinaciaero();
	}
	
	
}
