PImage creeper; 
int x= 200;
int y= 250;
void setup() {
  size(612, 408);
  PImage minecraft = loadImage("minecraft.png.jpeg");  
  minecraft.resize(612, 408);          
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(11, 5);
}

void draw() {
  image(creeper, 200, 200);
  if (mousePressed) {
  
  }
}