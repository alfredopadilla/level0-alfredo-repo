import java.util.Random;

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
  if (mousePressed) {
    mousePressed();
  }
}


void mousePressed() {
  int distance = getDistance( x, y, sizex, sizey);
  System.out.println(distance);
  if (distance>(-1 * (sizex/2)) && distance< (sizey/2));
  x=new Random().nextInt(180);
  y=new Random().nextInt(180);
}

int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
}