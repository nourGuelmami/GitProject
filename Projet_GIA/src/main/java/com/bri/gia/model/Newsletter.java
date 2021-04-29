package com.bri.gia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//on ajoute l'annotation @Entity pour appliquer la persistance a la classe Newsletter
@Entity
public class Newsletter implements Serializable {
	//on declare les attributs de la classe Newsletter
		//on ajoute l'annotation @Id juste au dessus de l'attribut id_newsletter pour dire que cet attribut 
		//corresspond a une cle primaie dans la table Newsletter
		@Id
		int id_newsletter;
		
		@Column(name="sujet_newsletter" , length=200 ) 
		String sujet_newsletter;
		
		@Column(name="date_newsletter", length=45 ) 
		Date date_newsletter;
		

		//on declare un constructeur non parametre
		public Newsletter() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//on declare un constructeur parametre
		public Newsletter(int id_newsletter, String sujet_newsletter, Date date_newsletter) {
			super();
			this.id_newsletter = id_newsletter;
			this.sujet_newsletter = sujet_newsletter;
			this.date_newsletter = date_newsletter;
		}
		
		//on declare les getters et setters
		public int getId_newsletter() {
			return id_newsletter;
		}
		public void setId_newsletter(int id_newsletter) {
			this.id_newsletter = id_newsletter;
		}
		public String getSujet_newsletter() {
			return sujet_newsletter;
		}
		public void setSujet_newsletter(String sujet_newsletter) {
			this.sujet_newsletter = sujet_newsletter;
		}
		public Date getDate_newsletter() {
			return date_newsletter;
		}
		public void setDate_newsletter(Date date_newsletter) {
			this.date_newsletter = date_newsletter;
		}

		
		
		
	
}
