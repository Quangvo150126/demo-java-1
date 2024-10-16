public class MainBall {
    public static void main(String[] args) {
        // Create a new ball with starting position (50, 50), radius 10, and movement deltas 5 and 7
        Ball ball = new Ball(50, 50, 10, 5, 7);

        // Display the initial state
        System.out.println(ball);

        // Move the ball and display its position
        for (int i = 0; i < 10; i++) {
            ball.move();
            System.out.println(ball);

            // Reflect if it reaches a certain boundary for the sake of demonstration
            if (ball.getX() >= 100 || ball.getX() <= 0) {
                ball.reflectHorizontal();
            }
            if (ball.getY() >= 100 || ball.getY() <= 0) {
                ball.reflectVertical();
            }
        }
    }
}
