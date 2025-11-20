class Ball{
  PVector location;
  PVector velocity;
  PVector acceleration;
  color c;
  float mass;
 
  Ball(float x, float y, float xVel, float yVel){  
      location = new PVector(x, y);
      velocity = new PVector(xVel, yVel);
      acceleration = new PVector(0, 0);
      c = color(random(255), random(255), random(255));
      mass = random(0.2, 2);
  }

 
  void move(){
    // Update velocity based on acceleration
    velocity.add(acceleration);
    // Update location based on velocity
    location.add(velocity);
    // Reset acceleration for the next frame
    acceleration.set(0, 0);
   
    velocity.limit(5); //let's have a limit velocity cannot have a magnitud greater than 5
  }

void bounce() {
    // Check if ball hits the edges
    if (location.x < 0 || location.x > width) {
        velocity.x *= -1; // not sure if we're supposed to make it slow down but if we're supposed to, change to a 0.8
    }
    if (location.y < 0 || location.y > height) {
        velocity.y *= -1;
    }

    // So it won't glitch out
    location.x = constrain(location.x, 0, width);
    location.y = constrain(location.y, 0, height);
}

 
void applyForce(PVector force) {
    // F = m * a 
    PVector accelerationDueToForce = PVector.div(force, mass);
    acceleration.add(accelerationDueToForce);

  }

 
  void display(){
    stroke(1);
    strokeWeight(2);
    fill(c);
    ellipse(location.x, location.y, 50 * mass, 50 * mass);
  }
 
}