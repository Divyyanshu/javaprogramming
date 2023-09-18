public static int[] removeDuplicates(int[] arr) {
    // Create a new array to store the unique elements.
    int[] uniqueArray = new int[arr.length];
  
    // Iterate over the original array and add each element to the new array if it is not already present.
    int uniqueArrayIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (!contains(uniqueArray, arr[i])) {
        uniqueArray[uniqueArrayIndex++] = arr[i];
      }
    }
  
    // Return the new array.
    return uniqueArray;
  }
  
  private static boolean contains(int[] arr, int element) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        return true;
      }
    }
    return false;
  }