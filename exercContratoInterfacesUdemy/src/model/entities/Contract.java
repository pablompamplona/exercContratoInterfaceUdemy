package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	
	private String number;
	private LocalDate date;
	private Double totalValue;
	private ArrayList<Installment> installments = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(String number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}

	
}
