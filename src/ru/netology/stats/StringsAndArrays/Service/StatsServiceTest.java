package ru.netology.stats.StringsAndArrays.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    public void salesAmount() {
        int actual = service.salesAmount(sales);
        int expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void averageМonthlySales() {
        int actual = service.averageМonthlySales(sales);
        int expected = 15;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberOfTheMonthOfSaleForTheMaximumAmount() {
        int actual = service.numberOfTheMonthOfSaleForTheMaximumAmount(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberOfTheMonthOfSaleForTheMinimumAmount() {
        int actual = service.numberOfTheMonthOfSaleForTheMinimumAmount(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberOfMonthsBelowAverage() {
        int actual = service.numberOfMonthsBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void numberOfMonthsAboveAverage() {
        int actual = service.numberOfMonthsAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}