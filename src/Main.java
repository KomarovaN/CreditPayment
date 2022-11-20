public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Кредит 1 000 000 рублей на 1 год по ставе 9,99%");
        System.out.println("Ежемесячный платеж " + String.format("%.0f",service.calculation(1000000, 1, 9.99)) + " руб.");
        System.out.println();
        System.out.println("Кредит 1 000 000 рублей на 2 года по ставе 9,99%");
        System.out.println("Ежемесячный платеж " + String.format("%.0f",service.calculation(1000000, 2, 9.99)) + " руб.");
        System.out.println();
        System.out.println("Кредит 1 000 000 рублей на 3 года по ставе 9,99%");
        System.out.println("Ежемесячный платеж " + String.format("%.0f",service.calculation(1000000, 3, 9.99)) + " руб.");
    }
}