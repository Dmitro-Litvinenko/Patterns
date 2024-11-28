package org.adapter;

/* класс, який реалізує інтерфейс ReportProvider */
public class CustomReportProviderImpl implements ReportProvider {

    @Override
    public void printReport() {
        System.out.println("> Generating report using JasperReport...");
        /* можливий код для генерації звіту... */
    }

    @Override
    public void configureParams() {
        System.out.println("> Configuring parameters for JasperReport...");
        /* можливий код для налаштування параметрів генерації звіту */
    }

    @Override
    public void configureOutput() {
        System.out.println("> Configuring output for JasperReport...");
        /* можливий код для налаштування "виводу" згенерованого звіту */
    }
}
