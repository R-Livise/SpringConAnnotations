/**
 * 
 */
package com.rafael.SpringConAnnotations;

import org.springframework.stereotype.Component;

/**
 * @author rafael
 *
 */
@Component
public class InformeFinancieroTrim1 implements IInfomeFinaciero {

	@Override
	public String getInformeFinaciaero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero. TRIMESTRE1";
	}

}
