package behavioralDP.chainOfResponsibilityDP;

public abstract class Approver {

    Approver chief;

    //when we create obj we need to set the manager of class
    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
