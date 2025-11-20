int currentKernel = 0;

void setup() {
  size(1370, 800);
  PImage bird = loadImage("C:/Users/User/Pictures/Screenshots/Screenshot 2024-02-27 134052.png"); //change image path as needed, used a random image from home computer to test
  PImage output = bird.copy();
  
  Kernel k = new Kernel(new float[][] {
    {1, 0, -1},
    {2, 0, -2},
    {1, 0, -1}
  });

  k.apply(bird, output);
  image(bird, 0, 0);
  image(output, bird.width, 0);
}

void draw() {
//code breaks if i remove this, don't question 
}


void keyPressed() {
  if (key == CODED) {
    if (keyCode == LEFT) {
      currentKernel = (currentKernel - 1 + kernels.length) % kernels.length;
    } else if (keyCode == RIGHT) {
      currentKernel = (currentKernel + 1) % kernels.length;
    }
    
    PImage bird = loadImage("C:/Users/User/Pictures/Screenshots/Screenshot 2024-02-27 134052.png");  //change image path as needed, used a random image from home computer to test
    PImage output = bird.copy();
    kernels[currentKernel].apply(bird, output);
    image(bird, 0, 0);
    image(output, bird.width, 0);
    
    fill(255);
    rect(0, bird.height - 20, width, 20);
    fill(0);
    text(names[currentKernel], 10, bird.height - 5);
  }
}
String[] names = new String[] {
  "Identity", "Blur", "Sharpen",
  "Outline", "Left Sobel", "Right Sobel",
  "Top Sobel", "Emboss"
};

Kernel[] kernels = new Kernel[] {
  new Kernel(new float[][] {
    {0, 0, 0},
    {0, 1, 0},
    {0, 0, 0}
  }),
  new Kernel(new float[][] {
    {0.111, 0.111, 0.111},
    {0.111, 0.111, 0.111},
    {0.111, 0.111, 0.111}
  }),
  new Kernel(new float[][] {
    {0, -1, 0},
    {-1, 5, -1},
    {0, -1, 0}
  }),
  new Kernel(new float[][] {
    {-1, -1, -1},
    {-1, 8, -1},
    {-1, -1, -1}
  }),
  new Kernel(new float[][] {
    {1, 0, -1},
    {2, 0, -2},
    {1, 0, -1}
  }),
  new Kernel(new float[][] {
    {-1, 0, 1},
    {-2, 0, 2},
    {-1, 0, 1}
  }),
  new Kernel(new float[][] {
    {1, 2, 1},
    {0, 0, 0},
    {-1, -2, -1}
  }),
  new Kernel(new float[][] {
    {-2, -1, 0},
    {-1, 1, 1},
    {0, 1, 2}
  })
};

