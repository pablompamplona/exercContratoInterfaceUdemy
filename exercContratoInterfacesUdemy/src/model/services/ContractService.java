package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	OnlinePaymentService ops;
	
	public ContractService() {
		
	}

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuote = contract.getTotalValue()/months;
		for (int i = 1; i <= months; i++) {
			double updatedQuote = basicQuote + ops.interest(basicQuote, i);
			double fullQuote = updatedQuote + ops.paymentFee(updatedQuote);
			LocalDate dueDate = contract.getDate().plusMonths(i);
			contract.getInstallments().add(new Installment(dueDate,fullQuote));
		}
	}
	

}
