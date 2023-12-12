public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double bmiIndex = weightKg / (heightM * heightM);
        return (int) (bmiIndex);
    }
}
