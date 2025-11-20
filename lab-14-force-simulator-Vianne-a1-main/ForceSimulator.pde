ArrayList<Ball> ballList;

void setup() {
  size(1000, 800);
  ballList = new ArrayList<Ball>();
}

void mouseClicked() {
  if (mouseButton == LEFT) {
    float x = mouseX;
    float y = height/2;
    // First test with these values
    float xVel = 0;
    float yVel = 2;
    // When your code is working you may try with random velocities
  //  float xVel = random(-3, 3);
   // float yVel = random(-3, 3);
    ballList.add(new Ball(x, y, xVel, yVel));
  }
  
    if (mouseButton == RIGHT) {
    PVector wind = new PVector(9, 0);

    for (Ball b : ballList) {
      b.applyForce(wind.mult(b.mass));
    }}
}
void draw() {
  // Add a gravity force vector
  // Apply the gravity force to your objects (ball) considering the mass
  PVector gravity = new PVector(0, 0.05); // adjusting gravity so ball doesn't fly everywhere

  for (Ball b : ballList) {
    b.applyForce(gravity.mult(b.mass)); 
  }

 

  background(173, 216, 230);

  for (Ball b : ballList) {
    b.move();
    b.bounce();
    b.display();
  }

  fill(0);
  text(ballList.size(), 20, 40);
}
