package cor;

import dto.LoanApplication;

public class LoanValidator implements LoanProcessorIntf{

    LoanProcessorIntf loanProcessorIntf;

    public void handleRequest(LoanApplication loanApplication){
        System.out.println("Validation Step has Started");

        if(loanApplication.getAccountNumber().length() != 10){
            throw new RuntimeException("Account Number must be 10");
        }


        if(loanApplication.getCibilScore() < 750){
            throw new RuntimeException("Cibil Score must be greater than 750 to get a Loan");
        }

        if(loanApplication.getLendingBank().isEmpty()){
            throw new RuntimeException("Lending Institution is Empty");
        }

        if(loanApplication.getLoanAmount() < 100000){
            throw new RuntimeException("Loan Amount too Low");
        }

        loanProcessorIntf.handleRequest(loanApplication);
    }
    public void setNextHandler(LoanProcessorIntf loanProcessorIntf){
        this.loanProcessorIntf = loanProcessorIntf;
    }
}
