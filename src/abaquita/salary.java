package abaquita;

    
    
    public class salary {

    String name;
    int id;
    int rate, hours, gross, ded, netp;

    public void addemployees(int Eid, String name, int rate, int hours, int ded) {
        this.id = Eid;
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.ded = ded;
        this.gross = rate * hours;
        this.netp = gross - ded;
    }

    public void Employees() {
        System.out.printf("%-10d %-10s %-10d %-12d %-12d %-12d %-12d\n",
                this.id, this.name, this.rate, this.hours, this.gross, this.ded, this.netp);
    }

    public static void printHeader() {
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-12s %-12s\n", 
                          "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");
        System.out.println("--------------------------------------------------------------");
    }
}
    

