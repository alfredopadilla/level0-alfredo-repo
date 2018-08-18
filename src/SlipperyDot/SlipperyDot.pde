void setup() {
  size(350, 400);
}


int x = 180;
int y = 180;
int sizex = 300;
int sizey = 250;
void draw() {
  background(108, 165, 204); 
  ellipse(x, y, sizex, sizey);
}

void mousePressed() {
  //6a. create an integer variable called distance
  //6b. use the getDistance method to initialize your varible
  //    use the mouse's x and y and the x and y of your ellipse 

  //7. print the distance variable


  //8a. make an if statement to check if the distance variable
  //   is greater than negative half the size of the ellipse,
  //   and less than positive half the size of the ellipse.

  //8b.  set the x and y of the ellipse to a random location on the window
}

int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
}