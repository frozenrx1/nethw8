package taxes;

public class DebitTax extends TaxSystem {
    @Override
    public double calcTaxFor(double debit, double credit) {
        double tax = debit * 0.06;
        return Math.max(tax, 0);
    }
}

