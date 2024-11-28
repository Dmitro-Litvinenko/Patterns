package org.adapter;

/* інтерфейс для створення звітів (бібліотека JasperReport) */
public interface ReportProvider {
    void printReport(); // метод генерації (створення) звіту
    void configureParams(); // метод налаштування параметрів
    void configureOutput(); // метод налаштування "виводу" звіту
}
