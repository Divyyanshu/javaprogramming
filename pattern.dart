void printButterflyPattern(int n) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < 2 * n; j++) {
      if (j < i || j >= 2 * n - i) {
        // Print spaces before the first wing
        print(" ");
      } else if (j >= n && j < n + i) {
        // Print stars for the left wing
        print("*");
      } else if (j >= n && j < 2 * n - i - 1) {
        // Print stars for the right wing
        print("*");
      } else {
        // Print spaces between the wings
        print(" ");
      }
    }
    print(""); // Move to the next line after completing each row
  }
}

void main() {
  int n = 5; // You can change the value of n to adjust the size of the butterfly
  printButterflyPattern(n);
}