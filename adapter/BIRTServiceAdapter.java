package org.adapter;

/* клас адаптера, який надає можливість використовувати функцонал BIRTReport */
public class BIRTServiceAdapter implements ReportProvider {
    private BIRTDataSource dataSource; // ресурс із даними
    private ReportingBIRTService reportingBIRTService; // об'єкт для роботи з BIRTReport

    public BIRTServiceAdapter(BIRTDataSource dataSource) {
        this.dataSource = dataSource;
        this.reportingBIRTService = new ReportingBIRTService(dataSource);
    }

    /* адаптовані методи для роботи з BIRTReport */
    @Override
    public void printReport() {
        reportingBIRTService.printBIRTReport();
    }

    @Override
    public void configureParams() {
        reportingBIRTService.configureBIRTParams();
    }

    @Override
    public void configureOutput() {
        reportingBIRTService.configureBIRTOutput();
    }
}
