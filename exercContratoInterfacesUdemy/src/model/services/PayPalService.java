package model.services;

public class PayPalService implements OnlinePaymentService {
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_INT = 0.01;
	
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}
	
	@Override
	public double interest(double amount, int month) {
		return amount * (MONTHLY_INT * month);
	}

}
