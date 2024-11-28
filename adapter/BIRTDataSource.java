package org.adapter;

import lombok.Value;

@Value // клас, що визначає якийсь ресурс даних для генерації звітів ч/з BIRTReport
public class BIRTDataSource {
    String data;
    String path;
    String date;
}
