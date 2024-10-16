public class OPP11 {
        // Private instance variables
        private double radius;
        private String color;

        // Default constructor
        public OPP11() {
            this.radius = 1.0;
            this.color = "red";
        }

        // Overloaded constructor
        public OPP11(double radius) {
            this.radius = radius;
            this.color = "red"; // Default color
        }

        // Getter for radius
        public double getRadius() {
            return radius;
        }

        // Method to calculate the area of the circle
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Getter for color (optional, based on typical requirements)
        public String getColor() {
            return color;
        }

        // toString method to return a string representation of the circle (optional)
        @Override
        public String toString() {
            return "Circle[radius=" + radius + ", color=" + color + "]";
        }

}
