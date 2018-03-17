void setup() {
  PImage face = loadImage("Zombie picture.jpeg");
  image(face, 0, 0);
  size(225, 225);
}
void draw() {
  fill(mouseX, mouseY, mouseX);
  ellipse(85, 100, 40, 40);
  ellipse(145, 100, 40, 40);
  fill(000, 000, 000);
  ellipse(85, 100, 15, 15);
  ellipse(145, 100, 15, 15);
}