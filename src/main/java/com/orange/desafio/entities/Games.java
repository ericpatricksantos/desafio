package com.orange.desafio.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_games")
public class Games implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int[] numerosLoteria = new int[6];
	
	//Associação
	@ManyToOne
	@JoinColumn(name = "client_cpf")
	private User client;
	
	public Games() {
		
	}

	public Games(Long id, int[] numerosLoteria) {
		super();
		this.id = id;
		this.numerosLoteria = numerosLoteria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Arrays.hashCode(numerosLoteria);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Games other = (Games) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (!Arrays.equals(numerosLoteria, other.numerosLoteria))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int[] getNumerosLoteria() {
		return numerosLoteria;
	}

	public void setNumerosLoteria(int[] numerosLoteria) {
		this.numerosLoteria = numerosLoteria;
	}
	
	
}
