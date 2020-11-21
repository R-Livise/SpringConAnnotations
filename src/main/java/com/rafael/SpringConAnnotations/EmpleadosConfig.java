/**
 * 
 */
package com.rafael.SpringConAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author rafael
 *
 */
@Configuration
@ComponentScan("com.rafael.SpringConAnnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	public IInfomeFinaciero informeDtoComprasSmt1() {
		return new InformeDtoComprasSmt1();
	}
	
	public IInfomeFinaciero informeDtoComprasSmt2() {
		return new InformeDtoComprasSmt2();
	}
	
	@Bean
	public IEmpledo directivoFinacieroMedio() {
		return new DirectorFinanciero(informeDtoComprasSmt1());
	}
	
	@Bean
	public IEmpledo directivoFinacieroFinal() {
		return new DirectorFinanciero(informeDtoComprasSmt1());
	}
	
}
