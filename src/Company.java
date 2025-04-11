import taxes.TaxSystem;

public class Company {

    String name;
    int debit = 0,credit = 0;
    TaxSystem taxSystem;

    public Company(String companyName,TaxSystem taxSystem){
        this.name = companyName;
        this.taxSystem = taxSystem;
    }

    public void setTax(TaxSystem taxSystem){
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount){
        if(amount > 0){
            this.debit += amount;
        } else if (amount < 0) {
            this.credit += Math.abs(amount);
        }
    }

    public void payTaxes(){
        double taxes = this.taxSystem.calcTaxFor(this.debit,this.credit);
        System.out.println("Компания "+this.name+" уплатила налог в размере: "+taxes+" руб.;");
        this.debit = 0;
        this.credit = 0;
    }
}
