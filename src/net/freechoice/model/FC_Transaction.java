package net.freechoice.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="FC_Transaction")
public class FC_Transaction implements Serializable {

	private static final long serialVersionUID = -2333906984792981271L;
	
	private int 			_id;
	private boolean			is_valid;
	
	@ManyToOne
	@JoinColumn(name="_id")
	private int 			id_account_;
	
	private Timestamp		time_committed;
	private BigDecimal		amount;
	
	public FC_Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public boolean isIs_valid() {
		return is_valid;
	}

	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}

	public Timestamp getTime_committed() {
		return time_committed;
	}

	public void setTime_committed(Timestamp time_committed) {
		this.time_committed = time_committed;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getId_account_() {
		return id_account_;
	}


	public void setId_account_(int id_account_) {
		this.id_account_ = id_account_;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof FC_Transaction ? 
				(((FC_Transaction)o)._id == this._id ? true : false) 
				: false;
	}
	@Override
	public int hashCode() {
		return this._id;
	}



}
