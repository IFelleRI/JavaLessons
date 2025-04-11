package taxes;

public class TaxSystemDebitCredit extends  TaxSystem{
    @Override
    public double calcTaxFor(int debit, int credit) {
        double tax = (debit - credit) * 0.15;
        return tax < 0 ? 0 : tax;
    }
}
