/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given width and height.
   *
   * @param width the width of the rectangle
   * @param height the height of the rectangle
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by multiplying its width and height by a factor.
   *
   * @param factor the amount to multiply each dimension by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare against
   * @return true if this rectangle's area is greater than other's area
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}