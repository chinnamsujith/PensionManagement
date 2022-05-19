package com.cts.pension.process.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProcessPensionInput {

	private long aadharNumber;
	private double pesionAmount;
	private double bankCharge;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aadharNumber ^ (aadharNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(bankCharge);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pesionAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ProcessPensionInput other = (ProcessPensionInput) obj;
		if (aadharNumber != other.aadharNumber)
			return false;
		if (Double.doubleToLongBits(bankCharge) != Double.doubleToLongBits(other.bankCharge))
			return false;
		if (Double.doubleToLongBits(pesionAmount) != Double.doubleToLongBits(other.pesionAmount))
			return false;
		return true;
	}
	public ProcessPensionInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProcessPensionInput(long aadharNumber, double pesionAmount, double bankCharge) {
		this.aadharNumber = aadharNumber;
		this.pesionAmount = pesionAmount;
		this.bankCharge = bankCharge;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public double getPesionAmount() {
		return pesionAmount;
	}
	public void setPesionAmount(double pesionAmount) {
		this.pesionAmount = pesionAmount;
	}
	public double getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(double bankCharge) {
		this.bankCharge = bankCharge;
	}
	
	
}
