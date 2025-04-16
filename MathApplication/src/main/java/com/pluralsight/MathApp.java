public class MathApp {
    public static void main(String[] args) {
        // 1. Salary Comparison - highest salary
        double bobSalary = 40000.00, garySalary = 100000.00, highestSalary = 0.0;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.printf("The highest salary is: $%.2f", highestSalary);
        System.out.println();

        // 2. Vehicle Comparison - most affordable
        double carPrice = 12500.00, truckPrice = 32000.00;
        System.out.printf("The most affordable vehicle is: $%.2f", Math.min(carPrice, truckPrice));
        System.out.println();

        // 3. Find and display the area of a circle whose radius is 7.25
        float area = (float) (Math.PI * 7.25);
        System.out.printf("The area of a circle with a radius of 7.25 is: %.2f", area);
        System.out.println();

        // 4. Find and display the square root a variable after it is set to 5.0
        float total = (float) 5.0;
        String sqrt = String.format("%.4f", Math.sqrt(total));
        System.out.println("The square root of 5.0 is : " + sqrt);

        // 5. Find and display the distance between the points (5, 10) and (85, 50)
        // Formula: d = √((x2 - x1)² + (y2 - y1)²)
        int x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        String distance = String.format("%.4f", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("The distance between (5,10) and (85, 50) is: " + distance);

        // 6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        float num_6 = (float) -3.8;
        String absolute_value = String.format("%.1f", Math.abs(num_6));
        System.out.println("The absolute value of -3.8 is: " + absolute_value);

        // 7. Find and display a random number between 0 and 1
        System.out.println("Your lucky decimal trio #1 today is: " + String.format("%.2f", Math.random()));
        System.out.println("Your lucky decimal trio #2 today is: " + String.format("%.2f", Math.random()));
        System.out.println("Your lucky decimal trio #3 today is: " + String.format("%.2f", Math.random()));
    }
}