void setup() {
  background(226, 65, 244); 
  size(300, 300);
}
void draw() {
  fill(255, 255, 255);
  for (int i =100; i <=120; i= i+10) {
    text("ice cream", 100, i);
  }
  text("banana", 100, 130);
}