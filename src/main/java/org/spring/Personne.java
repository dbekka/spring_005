package org.spring;

public class Personne
{
	private String nom;
	private Vehicule vehicule;

	public Personne()
	{
		this.nom = "";
		this.vehicule = new Vehicule();
	}
	
	public Personne(String s, Vehicule v)
	{
		this.nom = s;
		this.vehicule = v;
	}
	
	@Override
	public String toString()
	{
		return "Nom : " + this.nom + " -- Vehicule : " + this.vehicule.getEnergie() + " -- Id : " + this.vehicule.getId();
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public Vehicule getVehicule()
	{
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule)
	{
		this.vehicule = vehicule;
	}
}
