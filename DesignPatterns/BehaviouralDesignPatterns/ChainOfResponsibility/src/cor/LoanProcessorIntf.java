package cor;

import dto.LoanApplication;

public interface LoanProcessorIntf {

    public void handleRequest(LoanApplication loanApplication);
    public void setNextHandler(LoanProcessorIntf loanProcessorIntf);
}
