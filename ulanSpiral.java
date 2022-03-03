int x, y;
int px;
int py;
int step = 1;
int stepSize = 1;
int numStep = 1;
int state = 0;
int turnCounter = 0;
int totalSteps;



boolean isPrime( int value) {
    //let primey =  true;
    if (value == 1) return false;
    for (int i = 2; i <= sqrt(value); i++) {
        if (value % i == 0) {
            //primey = false;
            //break;
            return false;
        }
    }
    //return primey;
    return true;
}

void setup() {
    //createCanvas(500, 500);
    //textFont("Courier");
    size(1920, 1920);

    int cols = width / stepSize;
    int rows = height / stepSize;
    totalSteps = cols * rows;

    x = width / 2;
    y = height / 2;
    px = x;
    py = y;
    background(0);

//}

//void draw() {
    //background(0);
    
    while (step <= totalSteps){
    //textSize(stepSize);
    //textAlign(CENTER, CENTER);
    //text(step, x, y);
    fill(255);
    stroke(255);
    //rectMode(CENTER);

    if (isPrime(step)) {
        //circle(x, y, stepSize * 0.5);
        point(x, y);
    }
    //line(x, y, px, py);
    px = x;
    py = y;

    switch (state) {
        case 0:
            x += stepSize;
            break;
        case 1:
            y -= stepSize;
            break;
        case 2:
            x -= stepSize;
            break;
        case 3:
            y += stepSize;
            break;
    }



    if (step % numStep == 0) {
        state = (state + 1) % 4;
        turnCounter++;
        if (turnCounter % 2 == 0) {
            numStep++;
        }
    }


    step++;

    //  frameRate(3);

    //if (step > totalSteps) {
     //   noLoop();
    }
    
    save("ulanspiral.png");
}