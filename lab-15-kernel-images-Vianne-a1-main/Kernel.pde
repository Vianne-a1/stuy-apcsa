public class Kernel {
  float[][]kernel;

  /**Constructor takes the kernel that will be applied to the image
  *This implementation only allows 3x3 kernels
  */
  public Kernel(float[][]init) {
    kernel = init;
  }

  /**If part of the kernel is off of the image, return black, Otherwise
  *Calculate the convolution of r/g/b separately, and return that color\
  *if the calculation for any of the r,g,b values is outside the range
  *     0-255, then clamp it to that range (< 0 becomes 0, >255 becomes 255)
  */
    int calcNewColor(PImage img, int x, int y) {
        int imgWidth = img.width;
        int imgHeight = img.height;

        float rSum = 0;
        float gSum = 0;
        float bSum = 0;

        // Iterate over the 3x3 kernel
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int imgX = x + i;
                int imgY = y + j;

                if (imgX >= 0 && imgX < imgWidth && imgY >= 0 && imgY < imgHeight) {
                    int pixelColor = img.get(imgX, imgY);
                    float kernelValue = kernel[i + 1][j + 1];

                   rSum += red(pixelColor) * kernelValue;
                    gSum += green(pixelColor) * kernelValue;
                    bSum += blue(pixelColor) * kernelValue;



                }
            }
        }

        int r = constrain((int) rSum, 0, 255);
        int g = constrain((int) gSum, 0, 255);
        int b = constrain((int) bSum, 0, 255);

        return color(r, g, b);
   
  }
  /**Apply the kernel to the source,
  *and saves the data to the destination.*/
   void apply(PImage source, PImage destination) {
        source.loadPixels();
        destination.loadPixels();

        for (int y = 0; y < source.height; y++) {
            for (int x = 0; x < source.width; x++) {
                int newColor = calcNewColor(source, x, y);
                destination.pixels[y * source.width + x] = newColor;
            }
        }

        destination.updatePixels();
    }

}
