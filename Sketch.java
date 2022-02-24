import processing.core.PApplet;

public class Sketch extends PApplet {
  public void settings() {

    // Set size of application
    size(800, 800);
  }

  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
  }

  public void draw() {

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect(width/-20, (float)(height/1.07), (float)(width/0.91), height/1);

    // Stroke settings for house
    strokeWeight(0);
    fill(105, 27, 22);
    stroke(255);

    //house
    rect(width/4, (float)(height/2.25), width/2, height/2);
    
    //Chimney
    rect((float)(width/1.67), height/4, width/10, (float)(height/5.71));

    //colour settings for roof
    fill(79, 30, 2);

    //Roof
    triangle(width/8, (float)(height/1.92), (float)(width/1.14), (float)(height/1.92), width/2, height/4);

    // Stroke setting for window
    fill(145, 234, 330);

    //window
    ellipse( width/2, (float)(height/2.35),  (float)(width/13.33), (float)(height/13.33));

    //stroke setting for sun
    fill(255, 242, 0);

    //sun
    ellipse(width/1, 0, width/4, height/4);

  
    


  }
}