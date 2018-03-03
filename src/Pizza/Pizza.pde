import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

void setup() {
  size(800, 500 );
  minim = new Minim(this);
  sound = minim.loadFile("plop.wav");
  PImage pizzaBox = loadImage("pizza box.jpeg");     //in setup method
  pizzaBox.resize(800, 500);      //to match your canvas size
  background(pizzaBox);       //in setup method
  fill(219, 162, 74); 
  ellipse(400, 250, 450, 450);
  fill(225, 35, 1); 
  ellipse(400, 250, 400, 400);
  fill(255, 250, 138); 
  ellipse(400, 250, 380, 380);
}
void draw() {

  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  PImage curly = loadImage("curly.ppm.gif");
  if (mousePressed && (mouseButton == RIGHT)) {
    sound.play();
    image(pepperoni, mouseX, mouseY);
  }
  if (mousePressed && (mouseButton == LEFT)) {
    sound.play();
    image(curly, mouseX, mouseY);
  }
}