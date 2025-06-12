package cor;

import dto.LoanApplication;

public class LoanEnrichment implements LoanProcessorIntf{

    private LoanProcessorIntf loanProcessorIntf;

    public void handleRequest(LoanApplication loanApplication){
        loanApplication.setLendingBank("PNC Bank");
        System.out.println("Enrichment Step is Complete");

        loanProcessorIntf.handleRequest(loanApplication);
    }

    public void setNextHandler(LoanProcessorIntf loanProcessorIntf){
        this.loanProcessorIntf = loanProcessorIntf;
    }
}
