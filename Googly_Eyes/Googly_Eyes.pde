
void setup() {
  PImage face = loadImage("homersimpson.jpg");
  size(800, 600);
  face.resize(width, height);
  background(face);
}

void draw() { 
  println("X: " + mouseX + " Y:" + mouseY); 
    if (mouseX>=362&&mouseX<=393&&mouseY>=181&&mouseY<=197){
//left eye
  ellipse(375, 180, 60, 60);
  fill(0, 0, 0);
//left pupil
 ellipse(mouseX, mouseY, 20, 20);
  fill(255, 255, 255);
}
 {
  if (mouseX>=362&&mouseX<=393&&mouseY>=181&&mouseY<=197) {
   //right eye
    ellipse(435, 200, 70, 70);
    fill(0, 0, 0);
    
    //right pupil
    ellipse(mouseX+60, mouseY+20, 20, 20);
    fill(255, 255, 255);
    
  }
}
}