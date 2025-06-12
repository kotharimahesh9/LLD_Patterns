package cor;

import dto.LoanApplication;

public class LoanDisburser implements LoanProcessorIntf{

    @Override
    public void handleRequest(LoanApplication loanApplication) {
        System.out.println("Disbursing Loan for  : " + loanApplication.getLoanAmount() +" dollars");
    }

    @Override
    public void setNextHandler(LoanProcessorIntf loanProcessorIntf) {

    }
}
