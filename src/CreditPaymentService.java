public class CreditPaymentService {
    public double calculation(int sum, int period, double rate) {
        double i = rate / 12 / 100; // месячная процентная ставка
        int n = period * 12;        // количество платежей
        double k = Math.pow(1+i, n);
        double kA = i * k / (k - 1); // коэффициент аннуитета
        return sum * kA;
    }
}
