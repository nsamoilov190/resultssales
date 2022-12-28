package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testTotal() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalSales(results);
        long expected = 180;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSales(results);
        long expected = 15;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(results);
        long expected = 20;
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(results);
        long expected = 7;
    }

    @Test
    public void underAverageTest() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.lowerThanAverage(results);
        long expected = 5;
    }

    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();
        long[] results = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.higherThanAverage(results);
        long expected = 5;

    }
}


