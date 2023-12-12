public class BmiService {
    public int calculate(int weight_kg, double height_m){
        double bmiIndex = weight_kg / (height_m * height_m);
        return (int) (bmiIndex);
    }
}
