
void setup() {
  PImage face = loadImage("homersimpson.jpg");
  size(800, 600);
  face.resize(width, height);
  background(face);
  
}

void draw() {  
  ellipse(375, 180, 60, 60);
  fill(0, 0, 0);
  ellipse(mouseX, mouseY, 20, 20);
  fill(255, 255, 255);
  ellipse(435, 200, 70, 70);
  fill(0,0,0);
  ellipse(mouseX+60,mouseY+20,20,20);
  fill(255, 255, 255);
  
}