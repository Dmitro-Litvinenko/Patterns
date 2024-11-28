package org.adapter;

/* клас для створення звітів через функціонал BIRTReport за допомогою OSGi сервісів */
public class ReportingBIRTService {
    private final BIRTDataSource dataSource; // ресурс із даними

    public ReportingBIRTService(BIRTDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void printBIRTReport() {
        System.out.println("> Generating report using BIRTReport from the data source: " + dataSource.getData());
        /* можливий код для генерації звіту бібліотеки BIRTReport за допомогою OSGi сервісів... */
    }

    public void configureBIRTParams() {
        System.out.println("> Configuring parameters for BIRTReport from the data source: " + dataSource.getPath());
        /* можливий код для налаштування параметрів генерації звіту
        бібліотеки BIRTReport за допомогою OSGi сервісів... */
    }

    public void configureBIRTOutput() {
        System.out.println("> Configuring output for BIRTReport from the data source: " + dataSource.getDate());
        /* можливий код для налаштування "виводу" згенерованого звіту
        бібліотеки BIRTReport за допомогою OSGi сервісів... */
    }
}
