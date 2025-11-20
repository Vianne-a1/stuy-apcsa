public class MyStringMethods {

  public static void main(String[] args){
      String x = "test";
      String y = "xyz";
      System.out.print(myIndexOf(x, y));
    }
  
    // Explain how IndexOf method works in a few sentences
    // Then implement your own myIndexOf
  
  public static int myIndexOf(String myString, String targetString) {
    for (int i = 0; i <= myString.length() - targetString.length(); i++) {
        if (myString.substring(i, i + targetString.length()).equals(targetString)) {
            return i; 
        }
    }
    
  
    return -1;
  }
  /*
     * IndexOf, a method in Java, returns the numerical value of the location of the
     * first letter of your input in the string you are searching. If the input is
     * not found in the string, it will return a -1.
     */
  
    // Explain how CompareTo method works in a few sentences/
    // Then implement your own myCompareTo
  public static int myCompareTo(String myString, String otherString) {
    int minLength = Math.min(myString.length(), otherString.length());
    
    for (int i = 0; i < minLength; i++) {
        char myChar = myString.charAt(i);
        char otherChar = otherString.charAt(i);
        
        if (myChar != otherChar) {
            return myChar - otherChar;
        }
    }
    
  
    return myString.length() - otherString.length();
  }
  
  public static int myparseInt(String myString) {
    int result = 0;
    boolean isNegative = false;
    
  
    if (myString.charAt(0) == '-') {
        isNegative = true;
   
        myString = myString.substring(1);
    }
    
    for (int i = 0; i < myString.length(); i++) {
        char digitChar = myString.charAt(i);
        
  
        int digitValue = digitChar - '0';
  
        result = result * 10 + digitValue;
    }
    
  
    if (isNegative) {
        result = -result;
    }
    
    return result;
  }
  
  }
  
