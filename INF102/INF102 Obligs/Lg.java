class Lg {
  public static void main(String[] args) {
    double c = Double.parseDouble(args[0]);
    if (c<Math.exp(1)*Math.log(2))
      System.out.printf("The equation x = %.2flg(x) has no roots.%n", c);
    else {
      double x = 4*c;
      double lgx = Math.log(x)/Math.log(2);
      while (Math.abs(x-c*lgx)/x > 0.00001) {
        x = x - (c*lgx-x)/(c/x-x);
        lgx = Math.log(x)/Math.log(2);
      }
      System.out.printf("The equation x = %.2flg(x) has a root at x = %.2f%n", c, x);
    }
  }
}
