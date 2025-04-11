package taxes;

public class TaxSystemDebit extends TaxSystem{
    @Override
    public double calcTaxFor(int debit, int credit) {
        return debit * 0.06;
    }
}
