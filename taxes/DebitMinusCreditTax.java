package taxes;

public class DebitMinusCreditTax extends TaxSystem {
    @Override
    public double calcTaxFor(double debit, double credit) {
        double diff = debit - credit;
        if (diff > 0) {
            double tax = diff * 0.15;
            return Math.max(tax, 0);
        } else {
            return 0;
        }
    }
}

