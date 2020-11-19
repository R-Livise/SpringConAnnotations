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
public class InformeFinacieroTrim1 implements IInfomeFinaciero {

	@Override
	public String getInformeFinaciaero() {
		// TODO Auto-generated method stub
		return "Precentacion de informe financiiero. TRIM1";
	}

}
