package net.freechoice.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="FC_Transaction")
public class FC_Transaction implements Serializable {

	private static final long serialVersionUID = -2333906984792981271L;
	private static final int serialID32 = (int)(serialVersionUID ^ (serialVersionUID >>> 32));
	private int 			_id;
	private boolean			is_valid;
	
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

	@Override
	public boolean equals(Object o) {
		
		if (this == o) {
			return true;
		} else if (o instanceof FC_Transaction) {
			return ((FC_Transaction)o)._id == this._id;
		} else {
			return false;
		}
	}
    
	@Override
	public int hashCode() {
		return this._id * 31 + serialID32;
	}


}
