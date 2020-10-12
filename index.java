void setup() {
	size(400, 400);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!
int circleX = 80;
int circleY = 70;

int acircleX = 320;
int acircleY = 70;

int bcircleX = 80;
int bcircleY = 330;

int ccircleX = 320;
int ccircleY = 330;

  background(0);
  stroke(0);
  fill(0, 210, 255);


ellipse(circleX, circleY, 80, 80);
  
 ellipse(acircleX, acircleY, 80, 80);

 ellipse(bcircleX, bcircleY, 80, 80);

 ellipse(ccircleX, ccircleY, 80, 80);

}

