int x = 400;
int y = 400;
int leftx = 200;
int rightx = 605;
void setup() {
  
  size(800,800);
  
  noFill();
  for(int i = 0; i < 20; i++) {
    ellipse(leftx,400,x,y);
    x-=20;
    y-=20;
  }
  
  for(int i = 0; i < 20; i++) {
    ellipse(rightx,400,x,y);
    x-=20;
    y-=20;
  }
  
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  
}
