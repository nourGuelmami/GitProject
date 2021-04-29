package com.bri.gia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

//on ajoute l'annotation @Entity pour appliquer la persistance a la classe Genre
@Entity
public class Genre implements Serializable {

	//on declare les attributs de la classe user
		//on ajoute l'annotation @Id juste au dessus de l'attribut id_genre_user pour dire que cet attribut 
		//corresspond a une cle primaie dans la table Genre_user
			@Id
		int id_genre_user;
		String lib_genre_user_ar;
		String lib_genre_user_fr;
		String lib_genre_user_en;
		

		//declaration d'un constructeur non parametre
		public Genre() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		//declaration d'un constructeur parametre
		public Genre(int id_genre_user, String lib_genre_user_ar, String lib_genre_user_fr, String lib_genre_user_en) {
			super();
			this.id_genre_user = id_genre_user;
			this.lib_genre_user_ar = lib_genre_user_ar;
			this.lib_genre_user_fr = lib_genre_user_fr;
			this.lib_genre_user_en = lib_genre_user_en;
		}
		
		
		//declaration des getters et setters
		public int getId_genre_user() {
			return id_genre_user;
		}
		public void setId_genre_user(int id_genre_user) {
			this.id_genre_user = id_genre_user;
		}
		public String getLib_genre_user_ar() {
			return lib_genre_user_ar;
		}
		public void setLib_genre_user_ar(String lib_genre_user_ar) {
			this.lib_genre_user_ar = lib_genre_user_ar;
		}
		public String getLib_genre_user_fr() {
			return lib_genre_user_fr;
		}
		public void setLib_genre_user_fr(String lib_genre_user_fr) {
			this.lib_genre_user_fr = lib_genre_user_fr;
		}
		public String getLib_genre_user_en() {
			return lib_genre_user_en;
		}
		public void setLib_genre_user_en(String lib_genre_user_en) {
			this.lib_genre_user_en = lib_genre_user_en;
		}

		

}
