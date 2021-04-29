package com.bri.gia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//on ajoute l'annotation @Entity pour appliquer la persistance a la classe Profil
@Entity
public class Profil implements Serializable {
	//on declare les attributs de la classe Profil
		//on ajoute l'annotation @Id juste au dessus de l'attribut id_profil pour dire que cet attribut 
		//corresspond a une cle primaie dans la table profil
		@Id
		int id_profil;
		
		@Column(name="lib_profil", length=45 ) 
		String lib_profil;
		String descr_profil;

		
		
		//on declare un constructeur parametre
		public Profil() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		//on declare un constructeur parametre
		public Profil(int id_profil, String lib_profil, String descr_profil) {
			super();
			this.id_profil = id_profil;
			this.lib_profil = lib_profil;
			this.descr_profil = descr_profil;
		}
		
		
		//on declare les getters et setters
		public int getId_profil() {
			return id_profil;
		}
		public void setId_profil(int id_profil) {
			this.id_profil = id_profil;
		}
		public String getLib_profil() {
			return lib_profil;
		}
		public void setLib_profil(String lib_profil) {
			this.lib_profil = lib_profil;
		}
		public String getDescr_profil() {
			return descr_profil;
		}
		public void setDescr_profil(String descr_profil) {
			this.descr_profil = descr_profil;
		}
		
		
		
		
		
}
