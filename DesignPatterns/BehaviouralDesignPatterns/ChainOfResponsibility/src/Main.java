import cor.LoanDisburser;
import cor.LoanEnrichment;
import cor.LoanProcessorIntf;
import cor.LoanValidator;
import dto.HomeLoan;
import dto.LoanApplication;

public class Main {
    public static void main(String[] args) {
        LoanApplication loanApplication = new HomeLoan();

        loanApplication.setLoanAmount(1345003);
        loanApplication.setAccountNumber("1234567890");
        loanApplication.setCibilScore(42); // change it to something more than 750 to get a loan

        try{
            LoanProcessorIntf loanProcessorIntf = executeSteps();
            loanProcessorIntf.handleRequest(loanApplication);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static LoanProcessorIntf executeSteps(){
        LoanProcessorIntf step1 = new LoanEnrichment();
        LoanProcessorIntf step2 = new LoanValidator();
        LoanProcessorIntf step3 = new LoanDisburser();

        step1.setNextHandler(step2);
        step2.setNextHandler(step3);

        return step1;
    }
}