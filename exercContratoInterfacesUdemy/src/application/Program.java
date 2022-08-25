package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter Contract data: ");
		System.out.print("Number: ");
		String numberContract = input.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate dateContract = LocalDate.parse(input.nextLine(), formatter);
		System.out.print("Contract Value: ");
		double valueContract = input.nextDouble();
		System.out.print("Enter number of installments: ");
		int qtdInstallments = input.nextInt();
		
		Contract ct = new Contract(numberContract, dateContract, valueContract);
		ContractService cs = new ContractService(new PayPalService());
		cs.processContract(ct, qtdInstallments);
		
		for (Installment inst : ct.getInstallments()) {
			System.out.println(inst);
		}
		
		
		
	
	}
 
}
