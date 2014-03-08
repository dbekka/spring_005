package org.spring;

public class Vehicule
{
	private int id;
	private String energie;
	
	public Vehicule()
	{
		this.energie = "Diesel";
		this.id = 0;
	}
	
	public Vehicule(String e, int id)
	{
		this.energie = e;
		this.id = id;
	}

	public String getEnergie()
	{
		return energie;
	}

	public void setEnergie(String energie)
	{
		this.energie = energie;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
