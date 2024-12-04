package com.senac.passaporte.receptor.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passaporte implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passaporteID;
	@Column
	private int passaporteStatus;

	public int getPassaporteID() {
		return passaporteID;
	}

	public void setPassaporteID(int passaporteID) {
		this.passaporteID = passaporteID;
	}

	public int getPassaporteStatus() {
		return passaporteStatus;
	}

	public void setPassaporteStatus(int passaporteStatus) {
		this.passaporteStatus = passaporteStatus;
	}
	
	
}