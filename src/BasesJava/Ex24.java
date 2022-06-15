package BasesJava;

public class Ex24 {
    static boolean isPrefix(String word, String prefix){
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) != word.charAt(i)){
                return false;
            }
        }
        return  true;
    }
    static void print(String word, String prefix){
        if (isPrefix(word,prefix)){
            System.out.printf("%s is a prefix of %s\n",prefix,word);
        } else {
            System.out.printf("%s is not a prefix of %s\n",prefix,word);
        }
    }
    public static void main(String[] args) {
        print("banner", "bang");
        print("hugging", "hug");
    }
}
