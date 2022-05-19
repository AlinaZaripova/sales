package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;

    }

    //средняя сумма продаж
    public long meanSales(int[] sales) {
        int meanSales = 0;
        for (int sale : sales) {
            meanSales += sale / sales.length;

        }
        return meanSales;

    }
    // номер месяца в котором пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;

    }
    // номер месяца в котором минимум продаж

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public long aboveMeanSales(int[] sales) {
        long aboveMeanSales = 0;
        long meanSales = meanSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > meanSales) {
                aboveMeanSales++;

            }


        }

        return aboveMeanSales;

    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public long belowMeanSales(int[] sales) {
        long aboveMeanSales = 0;
        long meanSales = meanSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < meanSales) {
                aboveMeanSales++;

            }


        }

        return aboveMeanSales;

    }


}



