package ru.netology.stats.StringsAndArrays.Service;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;

    }

    public int averageМonthlySales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }


    public int numberOfTheMonthOfSaleForTheMaximumAmount(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numberOfTheMonthOfSaleForTheMinimumAmount(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfMonthsBelowAverage(int[] sales) {
        int count = 0;
        int averageSum = averageМonthlySales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int numberOfMonthsAboveAverage(int[] sales) {
        int count = 0;
        int averageSum = averageМonthlySales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                count++;
            }
        }
        return count;
    }

}
