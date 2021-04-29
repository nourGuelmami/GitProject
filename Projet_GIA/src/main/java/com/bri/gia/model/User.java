package com.bri.gia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//on ajoute l'annotation @Entity pour appliquer la persistance a la classe User
@Entity
//on ajoute l'annotation @Table pour redefinir le nom de la table 
@Table(name="user")
public class User implements Serializable{
	//on declare les attributs de la classe user
		//on ajoute l'annotation @Id juste au dessus de l'attribut id_user pour dire que cet attribut 
		//corresspond a une cle primaie dans la table user_table
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id_user;
		//on ajoute l'annotation @Column pour specifier la taille du champs,
	    //pour empecher cette colonne de porter des valeurs nulles
		@Column(name="nom_user_ar", length=45 ) 
		String nomUser_ar;
		
		@Column(name="nom_user_fr" , length=45 ) 
		String nomUser_fr;
		
		@Column(name="nom_user_en", length=45 ) 
		String nomUser_en;
		
		@Column(name="prenom_user_ar" , length=45 ) 
		String prenomUser_ar;
		
		@Column(name="prenom_user_fr", length=45 ) 
		String prenomUser_fr;
		
		@Column(name="prenom_user_en", length=45 ) 
		String prenomUser_en;
		
		@Column(name="password", length=100) 
		String password;
		
		@Column(name="reset_password", length=100) 
		String resetPassword;
		
		@Column(name="username", length=30 ) 
		String username;
		
		@Column(name="phoneNumber1" , length=45) 
		String phoneNumber1;
		
		@Column(name="phoneNumber2", length=45) 
		String phoneNumber2;
		
		@Temporal(TemporalType.TIMESTAMP)//on ajoute l'annotation @Temporal pour enregistrer les deux informations heure et date de la journée
		Date creationDate = new Date(System.currentTimeMillis());
		
		//@Temporal(TemporalType.DATE) //on ajoute lannotation @Temporal pour enregistrer les dates en tant que jour/mois/année
		String birthdayDate;
		
		@Column(name="email_1",length=150) 
		String email;
		
		@Column(name="email2", length=150) 
		String email2;
		
		String adress;

		//constructeur parametre
		public User(String nomUser_ar, String nomUser_fr, String nomUser_en, String prenomUser_ar, String prenomUser_fr,
				String prenomUser_en, String password, String resetPassword, String username, String phoneNumber1,
				String phoneNumber2, Date creationDate, String birthdayDate, String email, String email2,
				String adress) {
			super();
			this.nomUser_ar = nomUser_ar;
			this.nomUser_fr = nomUser_fr;
			this.nomUser_en = nomUser_en;
			this.prenomUser_ar = prenomUser_ar;
			this.prenomUser_fr = prenomUser_fr;
			this.prenomUser_en = prenomUser_en;
			this.password = password;
			this.resetPassword = resetPassword;
			this.username = username;
			this.phoneNumber1 = phoneNumber1;
			this.phoneNumber2 = phoneNumber2;
			this.creationDate = creationDate;
			this.birthdayDate = birthdayDate;
			this.email = email;
			this.email2 = email2;
			this.adress = adress;
		}

		//constructeur non parametre
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		//getters and setters
		public String getNomUser_ar() {
			return nomUser_ar;
		}

		public void setNomUser_ar(String nomUser_ar) {
			this.nomUser_ar = nomUser_ar;
		}

		public String getNomUser_fr() {
			return nomUser_fr;
		}

		public void setNomUser_fr(String nomUser_fr) {
			this.nomUser_fr = nomUser_fr;
		}

		public String getNomUser_en() {
			return nomUser_en;
		}

		public void setNomUser_en(String nomUser_en) {
			this.nomUser_en = nomUser_en;
		}

		public String getPrenomUser_ar() {
			return prenomUser_ar;
		}

		public void setPrenomUser_ar(String prenomUser_ar) {
			this.prenomUser_ar = prenomUser_ar;
		}

		public String getPrenomUser_fr() {
			return prenomUser_fr;
		}

		public void setPrenomUser_fr(String prenomUser_fr) {
			this.prenomUser_fr = prenomUser_fr;
		}

		public String getPrenomUser_en() {
			return prenomUser_en;
		}

		public void setPrenomUser_en(String prenomUser_en) {
			this.prenomUser_en = prenomUser_en;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getResetPassword() {
			return resetPassword;
		}

		public void setResetPassword(String resetPassword) {
			this.resetPassword = resetPassword;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPhoneNumber1() {
			return phoneNumber1;
		}

		public void setPhoneNumber1(String phoneNumber1) {
			this.phoneNumber1 = phoneNumber1;
		}

		public String getPhoneNumber2() {
			return phoneNumber2;
		}

		public void setPhoneNumber2(String phoneNumber2) {
			this.phoneNumber2 = phoneNumber2;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public String getBirthdayDate() {
			return birthdayDate;
		}

		public void setBirthdayDate(String birthdayDate) {
			this.birthdayDate = birthdayDate;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail2() {
			return email2;
		}

		public void setEmail2(String email2) {
			this.email2 = email2;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		
		
		
	
		

		
		}

