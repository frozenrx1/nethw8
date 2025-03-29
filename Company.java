import taxes.TaxSystem;

public class Company {
    String title;
    double debit = 0;
    double credit = 0;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem newTaxSystem) {
        this.taxSystem = newTaxSystem;
    }

    private double calculateTax() {
        return taxSystem.calcTaxFor(debit, credit);
    }

    public void payTaxes() {
        double taxAmount = calculateTax();
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxAmount + " руб.");
        debit = 0;
        credit = 0;
    }
}
