package assignments.ints1;

public class VolumeOfASphere {
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv YOUR CODE vvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
    private static double sphereVolume(double radius) {
        // We use "double" instead of "int" to get decimals.
        // return the volume of a sphere.
        return 0;
    }

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ YOUR CODE ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    private static void TestSphereVolume(double radius, double expected) {
        double result = sphereVolume(radius);
        boolean pass = Math.abs(result - expected) < 0.001;
        System.out.printf(
                "sphereVolume(%f) -> %f | %f | %s \n", radius, expected, result, pass ? "OK " : "X ");
    }

    public static void main(String[] args) {
        System.out.println("Function Call -> Expected | Yours | Pass?\n");
        TestSphereVolume(1, 4.186667);
        TestSphereVolume(2, 33.493333);
        TestSphereVolume(3, 113.040000);
    }
}
