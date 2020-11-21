package com.rafael.SpringConAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Importar el achivo de congiguracion

//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicacionContext.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class); 
		
		// pedir un bean al contenedor

			//accso por @Beans
		IEmpledo Lucia = context.getBean("directivoFinacieroMedio", IEmpledo.class);
		
			//acceso por @Component
		ComercialExperimentado Antonio = context.getBean("comercialExperimentado", ComercialExperimentado.class);
		
		// usar el bean

		System.out.println("Lucia");
		System.out.println(Lucia.getInformes());
		
		System.out.println("Antonio");
		System.out.println(Antonio.getInformes());
		
		System.out.println("Email " + Antonio.getEmail());
		System.out.println("Empresa " + Antonio.getNombreEmpresa());
		
		
		// cerrar el contexto
		
		context.close();
		
		
	}
}
