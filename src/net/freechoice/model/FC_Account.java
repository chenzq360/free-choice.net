package net.freechoice.model;


import java.io.Serializable;
import java.sql.Date;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//@Column(name="is", columnDefinition="Decimal(10,2) default '100.00'")

@Entity
@Table(name="FC_Account")
public class FC_Account implements Serializable , FreeChoiceEntity{

	private static final long serialVersionUID = -8496712751903083205L;
	
	private static final int serialID32 = (int)(serialVersionUID ^ (serialVersionUID >>> 32));

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int 				_id;
	
	private boolean				is_valid = true;
	
	private Date				date_create;
	
	private BigDecimal			balance;
	
	public FC_Account() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int get_id() {
		return _id;
	}

	@Override
	public void set_id(int _id) {
		this._id = _id;
	}

	@Override
	public boolean isIs_valid() {
		return is_valid;
	}

	@Override
	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}



	public Date getDate_create() {
		return date_create;
	}



	public void setDate_create(Date date_create) {
		this.date_create = date_create;
	}



	public BigDecimal getBalance() {
		return balance;
	}



	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	@Override
	public boolean equals(Object o) {
		return o instanceof FC_Account ? 
				(((FC_Account)o)._id == this._id ? true : false) 
				: false;
	}
    
	@Override
	public int hashCode() {
		return this._id * 31 + serialID32;
	}
	
}
