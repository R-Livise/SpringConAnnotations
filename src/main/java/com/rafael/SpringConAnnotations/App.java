package com.rafael.SpringConAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Importar el achivo de congiguracion

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicacionContext.xml");

		// pedir un bean al contenedor

		IEmpledo Antonio = context.getBean("comercialExperimentado", IEmpledo.class);

		// usar el bean

		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInformes());
		
		// cerrar el contexto
		
		context.close();
		
		
	}
}
