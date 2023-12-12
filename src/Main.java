public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 98;
        double height = 1.87;
        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("bmi index = " + bmiIndex);
    }
}