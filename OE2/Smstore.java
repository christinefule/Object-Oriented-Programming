public class Smstore extends Item {

    private String program;
    public String ItemNo, cashiername;

    public Smstore(String program, String ItemNo) {
        this.program = program;
        this.ItemNo = ItemNo;
    }// end constructor method

    // return methods
    public String getCashierName() {
        return "Christine Fule";
    }

    public String getDepartment() {
        return "SM SuperMarket Store";
    }

    public String getItemNo() {
        return ItemNo;
    }

    public String getPurchase() {
        return program;
    }

    // Set methods
    public void setProgram(String program) {
        this.program = program;
    }
}// end program