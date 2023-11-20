package ru.netology.stats.StringsAndArrays.Service;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.salesAmount(sales));
        System.out.println(service.averageМonthlySales(sales));
        System.out.println(service.numberOfTheMonthOfSaleForTheMaximumAmount(sales));
        System.out.println(service.numberOfTheMonthOfSaleForTheMinimumAmount(sales));
        System.out.println(service.numberOfMonthsBelowAverage(sales));
        System.out.println(service.numberOfMonthsAboveAverage(sales));


    }
}