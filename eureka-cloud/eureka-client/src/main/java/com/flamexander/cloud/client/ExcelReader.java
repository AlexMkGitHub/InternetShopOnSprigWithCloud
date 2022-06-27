package com.flamexander.cloud.client;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Component
public class ExcelReader {
    public static final String file = "JavaBooks.xlsx";

    public StringBuilder read() throws IOException, InvalidFormatException {
        StringBuilder sb = new StringBuilder();

        Workbook workbook = WorkbookFactory.create(new File(file));

        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();

        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // переберем столбцы текущей строки
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                sb.append(cellValue + "\t");
            }
            System.out.println();
        }
        return sb;
    }
}
