public class FinancialForecasting {

    public static double forecast(double startValue, double rate, int n) {
        if (n == 0) {
            return startValue;
        }

        return forecast(startValue, rate, n - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double startValue = 1000;
        double rate = 0.05;
        int years = 3;

        double futureValue = forecast(startValue, rate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
    }
}
