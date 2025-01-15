// Roman Orlov edited this file
public class function {

    public static void main(String[] args) {
        
        double start_point = -2.6;
        double end = 3.7;
        double step = 0.3;

        System.out.println("Таблица значений функций:");
        System.out.printf("%10s %15s %15s %15s\n", "x", "f1(x)", "f2(x)", "f3(x)");
        System.out.println("---------------------------------------------------------");
        for (double x = start_point; x <= end; x += step) {
            double f1 = Math.pow(x, 5) * (1 / Math.tan(2 * Math.pow(x, 3)));
            double f2 = 5 / (Math.tan(2 * x + 3) + 1);
            double f3 = Math.pow(x, 2) * Math.exp(-x);
            System.out.printf("%10.3f %15.5f %15.5f %15.5f\n", x, f1, f2, f3);
        }
    }
}
