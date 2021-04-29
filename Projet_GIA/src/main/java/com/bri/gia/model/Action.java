package com.bri.gia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//on ajoute l'annotation @Entity pour appliquer la persistance a la classe Acction
@Entity
public class Action implements Serializable {
	//on declare les attributs de la classe Action
		@Id
		int id_action;
		
		@Column(name="lib_action", length=45) 
		String lib_action;
		
		@Column(name="descr_action", length=45) 
		String descr_action;
		

		//generation d'un constructeur non parametre
		public Action() {
			super();
			// TODO Auto-generated constructor stub
		}

		//generation d'un constructeur parametre
		public Action(int id_action, String lib_action, String descr_action) {
			super();
			this.id_action = id_action;
			this.lib_action = lib_action;
			this.descr_action = descr_action;
		}

		//generation des getters et setters
		public int getId_action() {
			return id_action;
		}

		public void setId_action(int id_action) {
			this.id_action = id_action;
		}

		public String getLib_action() {
			return lib_action;
		}

		public void setLib_action(String lib_action) {
			this.lib_action = lib_action;
		}

		public String getDescr_action() {
			return descr_action;
		}

		public void setDescr_action(String descr_action) {
			this.descr_action = descr_action;
		}
}
