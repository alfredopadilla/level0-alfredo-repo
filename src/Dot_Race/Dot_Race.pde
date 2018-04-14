int dotx=2;
void setup() {
  size(800, 400);
}

void draw() {
  background(160,160,160);
  fill(244, 66, 86);
  if (mousePressed) {
  }
  dotx+=20;
  ellipse(dotx, 200, 100, 200);
  playSound();
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {
    Minim minim = new Minim(this);
    AudioSample sound = minim.loadSample("ding2.wav");
    sound.trigger();
    soundPlayed = true;
  }
}