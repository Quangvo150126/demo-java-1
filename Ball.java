public class Ball {
    private float x, y;        // x and y coordinates of the ball
    private int radius;        // radius of the ball
    private float deltaX, deltaY; // delta changes in x and y direction

    // Constructor
    public Ball(float x, float y, int radius, float deltaX, float deltaY) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    // Method to move the ball by its delta values
    public void move() {
        x += deltaX;
        y += deltaY;
    }

    // Method to reflect the ball horizontally
    public void reflectHorizontal() {
        deltaX = -deltaX;
    }

    // Method to reflect the ball vertically
    public void reflectVertical() {
        deltaY = -deltaY;
    }

    // toString method for displaying ball information
    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ") with velocity (" + deltaX + ", " + deltaY + ")";
    }
}
