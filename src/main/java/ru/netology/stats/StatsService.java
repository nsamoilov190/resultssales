package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] results) {
        long total = 0;

        for (long result : results) {
            total += result;

        }
        return total;
    }


    public long averageSales(long[] results) {
        return totalSales(results) / results.length;
    }


    public int minSales(long[] results) {
        int minMonth = 0;
        int month = 0;
        for (long result : results) {

            if (result <= results[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] results) {
        int maxMonth = 0;
        int month = 0;
        for (long result : results) {

            if (result <= results[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int lowerThanAverage(long[] results) {
        int underAverage = 0;
        for (long result : results) {
            if (result < averageSales(results)) {
                underAverage++;

            }

        }

        return underAverage;
    }

    public int higherThanAverage(long[] results) {
        int aboveAverage = 0;
        for (long result : results) {
            if (result > averageSales(results)) {
                aboveAverage++;

            }

        }
        return aboveAverage;

    }
}