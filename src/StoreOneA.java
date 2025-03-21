package src;

public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }


    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * 0.1); // 假设折扣率为10%
        }
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLOAN DETAILS (if applicable):\n" +
               "Loan Amount: " + getLoanAmount() + "\n" +
               "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
               "Interest Rate: " + getInterestRate() + "\n" +
               "Special Customer: " + specialCustomer + "\n" +
               "Monthly Loan Payment: " + monthlyPayment + "\n";
    }
}
