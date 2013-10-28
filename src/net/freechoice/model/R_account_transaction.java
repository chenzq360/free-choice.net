package net.freechoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.freechoice.util.HashUtil;



@Entity
@Table(name="R_account_transaction")
public class R_account_transaction implements Serializable {
	
	private static final long serialVersionUID = 4011434176350688650L;


	private int				id_transaction_;
	private int 			id_account_;
	
	public R_account_transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_transaction_() {
		return id_transaction_;
	}
	public void setId_transaction_(int id_transaction_) {
		this.id_transaction_ = id_transaction_;
	}
	public int getId_account_() {
		return id_account_;
	}
	public void setId_account_(int id_account_) {
		this.id_account_ = id_account_;
	}
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof R_account_transaction)) {
			return false;
		} else {
			R_account_transaction obj = (R_account_transaction)o;
			return obj.id_account_ == this.id_account_ 
					&& obj.id_transaction_ == this.id_transaction_;
		}
	}
	@Override
	public int hashCode() {
		return HashUtil.hashIntegers(id_account_, id_transaction_);
	}
}
