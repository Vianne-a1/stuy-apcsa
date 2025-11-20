public class Strings {
    public static void printString(String word){
System.out.print(word.substring(0));
if (word.length()>0){
    printString(word.substring(1, word.length() -1));
}

    }
    public static void printReverse(String word){
System.out.print(word.substring(word.length()));
if (word.length()>0){
    printString(word.substring(0, word.length() -1));
}
    }
    public int countChar(String word, String ch) {
for (int i = 0; i < word.length(); i++){
    if (word.substring(i) == ch){
        return i;
        break;
    } 
    return -1;
}
    }    
}
