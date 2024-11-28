package org.adapter;

public class ClientAPI {
    public static void main(String[] args) {
        System.out.println(">>> Pattern Adapter <<<\n");

        /* ініціалізація екземляру класу для генерування звітів через бібліотеку JasperReport */
        ReportProvider implJasperReport = new CustomReportProviderImpl();

        /* реалізація функціоналу JasperReport */
        implJasperReport.configureParams(); // налаштування параметрів
        implJasperReport.configureOutput(); // налаштування "виводу"
        implJasperReport.printReport(); // генерація звіту

        System.out.println("\n-------------------------------------------\n");

        /* ініціалізація екземляру класу для генерування звітів через бібліотеку BIRTReport */
        ReportProvider implBIRTReport = new BIRTServiceAdapter(
                new BIRTDataSource("Some data", "C://direct/report", "27.11.2024"));

        /* реалізація функціоналу BIRTReport */
        implBIRTReport.configureParams(); // налаштування параметрів
        implBIRTReport.configureOutput(); // налаштування "виводу"
        implBIRTReport.printReport(); // генерація звіту
    }
}