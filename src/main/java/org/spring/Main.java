package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring_beans.xml");
		
		Personne personne = (Personne) context.getBean("p1");
		System.out.println(personne);
		
		personne = (Personne) context.getBean("p2");
		System.out.println(personne);
		
		personne = (Personne) context.getBean("p3");
		System.out.println(personne);
		
	}
}
