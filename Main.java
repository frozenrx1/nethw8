import taxes.DebitMinusCreditTax;
import taxes.DebitTax;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Apple", new DebitMinusCreditTax());
        company.shiftMoney(35000);
        company.shiftMoney(-14000);
        company.shiftMoney(-1000);
        company.setTaxSystem(new DebitTax());
        company.payTaxes();
    }
}