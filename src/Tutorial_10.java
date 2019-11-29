public class Tutorial_10 {
    public static void main(String[] args) {

    }

    public static double calculateMagnitudeOfVector(double[] vector) {
        if(vector != null) {
            double total = 0;
            for(int index = 0; index < vector.length; index++) {
                total += Math.pow(vector[index], 2);
            }
            return Math.sqrt(total);
        }
        return 0;
    }
    
    public static void normaliseVector(double[] vector) {
        if(vector != null) {
            double magnitude = calculateMagnitudeOfVector(vector);
            for(int index = 0; index < vector.length; index++) {
                vector[index] = vector[index] / magnitude;
            }
        }
    }
    
    public static double calculateDotProductOfVector(double[] vector1, double[] vector2) {
        if(vector1 != null && vector2 != null) {
            if(vector1.length == vector2.length) {
                double total = 0;
                for(int index = 0; index < vector1.length; index++) {
                    total += vector1[index] * vector2[index];
                }
                return total;
            }
            else{
                System.out.println("Vectors are not the same dimension. Returning 0");
                return 0;
            }
        }
        return 0;
    }

    public static double[] addVectors(double[] vector1, double[] vector2) {
        if(vector1 != null && vector2 != null) {
            if(vector1.length == vector2.length) {
                double[] result = new double[vector1.length];
                for(int index = 0; index < vector1.length; index++) {
                    result[index] = vector1[index] + vector2[index];
                }
                return result;
            }
            else{
                System.out.println("Vectors are not the same dimension. Returning a null vector");
                return null;
            }
        }
        return null;
    }
}
