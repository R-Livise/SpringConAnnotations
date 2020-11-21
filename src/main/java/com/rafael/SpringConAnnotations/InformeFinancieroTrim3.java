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
public class InformeFinancieroTrim3 implements IInfomeFinaciero {

	@Override
	public String getInformeFinaciaero() {
		// TODO Auto-generated method stub
		return "Presentación de informe financiero. TRIM3";
	}

}
