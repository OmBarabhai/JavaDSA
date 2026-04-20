package Basics_Java;

public class PracticeStr {
    static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Index "+i+ " -> "+ ch);
        }
    }
    static void printVowels(String str){
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));
//            if(ch == 'a'||ch == 'e'||ch=='i'||ch == 'o'||ch=='u'||ch == 'A'||ch == 'E'||ch=='I'||ch == 'O'||ch=='U'){}
            if(ch == 'a'||ch == 'e'||ch=='i'||ch == 'o'||ch=='u'){

            System.out.println(ch);
            }
        }
    }

    static void printVowelsWithIdx(String str){
        for (int i = 0; i < str.length(); i++) {
            char original = str.charAt(i);
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a'||ch == 'e'||ch=='i'||ch == 'o'||ch=='u'){

                System.out.println("Index "+i+" --> "+original);
            }
        }
    }
    static int countVowels(String str){
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a'||ch == 'e'||ch=='i'||ch == 'o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    static int countConsonants(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(ch) && ch != 'a'&&ch != 'e'&&ch!='i'&&ch != 'o'&&ch!='u'){
                count++;
            }
        }
        return count;
    }
    static String rev(String str){
        String newStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            newStr += ch;
        }
        return newStr;
    }
    public static void main(String[] args) {
        printChar("Om");
        printVowels("Om Rajput");
        printVowelsWithIdx("Om Rajput");
        System.out.println(countVowels("Om Rajput"));
        System.out.println(countConsonants("Om Rajput"));
        System.out.println(rev("Om Rajput"));

    }
}
