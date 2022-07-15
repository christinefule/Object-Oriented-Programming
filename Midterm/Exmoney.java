public class Exmoney implements money {

    public double amount;
    public final double Dollar = 0.018, Peso = 56.47, Euro = 0.018, PesoE = 56.59;
    public String c1, c2;

    // CONSTRUCTOR
    public Exmoney(double amount, String c1, String c2) {
        this.amount = amount;
        this.c1 = c1;
        this.c2 = c2;
    }

    // setter
    public void changeAmount(double newAmount) {
        this.amount = newAmount;
    }

    public void changeCurrency(String newCurrency) {
        this.c1 = newCurrency;
    }

    public void changeToCurrency(String newCurrency) {
        this.c2 = newCurrency;
    }

    // getter
    public double getAmount() {
        return this.amount;
    }

    public double getCAmount() {
        switch (type()) {
            case "pte":
                return amount * Euro;
            case "ptd":
                return amount * Dollar;
            case "etp":
                return amount * PesoE;
            case "dtp":
                return amount * Peso;
            default:
                return amount;
        }
    }

    public String getC2() {
        return this.c2;
    }

    public void printConvertion() {
        String last = c1 + " to " + c2;
        System.out.println(last);
    }

    public void printRates() {
        System.out.println("1 PHP to US   =\t" + Dollar + "\t1 US to PHP   =\t" + Peso
                + "\n1 PHP to EU   =\t" + Euro + "\t1 EU to PHP   =\t" + PesoE + "\n");
    }

    public String type() {
        if (c1 == "Peso" && c2 == "Euro")
            return "pte";
        else if (c1 == "Peso" && c2 == "Dollar")
            return "ptd";
        else if (c1 == "Euro" && c2 == "Peso")
            return "etp";
        else if (c1 == "Dollar" && c2 == "Peso")
            return "dtp";
        return "SAME CURRENCY";
    }

    @Override
    public String getCurrency2() {
        // TODO Auto-generated method stub
        return null;
    }

}