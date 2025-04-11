import taxes.TaxSystem;
import taxes.TaxSystemDebit;
import taxes.TaxSystemDebitCredit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        TaxSystem taxSystemDebit = new TaxSystemDebit();
        TaxSystem taxSystemDebitCredit = new TaxSystemDebitCredit();

        Company[] companies = {
                new Company("Elen",taxSystemDebit),
                new Company("Artem",taxSystemDebitCredit),
                new Company("Kot",taxSystemDebit),
                new Company("Kohka",taxSystemDebit),
        };

        for(Company company : companies){
            company.shiftMoney(-10);
            company.payTaxes();
        }
    }
}


