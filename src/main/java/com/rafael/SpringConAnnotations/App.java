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
		
		IEmpledo Lucia = context.getBean("comercialExperimentado", IEmpledo.class);

		// usar el bean

		System.out.println(Antonio.getTareas());
		
		System.out.println(Antonio.getInformes());
		
		if(Antonio == Lucia) {
			System.out.println("Antonio y Lucia son iguales.");
		}else {
			System.out.println("Antonio y Lucia son ditintos.");
		}
		
		System.out.println(Antonio);
		System.out.println(Lucia);
		
		// cerrar el contexto
		
		context.close();
		
		
	}
}
