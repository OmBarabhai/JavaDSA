package Basics_Java;

public class BasicsStrings {
    static void printStr(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("----------------------");
        String name1 = "Om Rajput";
        for (char i = 0; i < name1.length() ; i++) {
            System.out.println(name1.charAt(i));
        }


    }

    static int getNum(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
//         int count = 0;
//
//        for (char ch : arr){
//            count++;
//        }
//        return count;
    }

    static int getVowels(String str){
        int n = str.length();
        int count = 0;

        for (char i = 0; i < n; i++) {
            char ch = Character.toLowerCase(str.charAt(i));

                if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }

        }
        return count;
    }
    static String  reverse1(String str) {
        String rev = "";
        int n = str.length();
        for (int i = n-1; i >=0  ; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;

        }
        return rev;
    }

    static String reverse2(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            char temp =  ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

    static boolean palindrome(String str){
        String original = str;
        String rev = reverse1(original);

        for(int i = 0;i < original.length();i++){
            char ch1 = original.charAt(i);
            char ch2 = rev.charAt(i);
            if(ch1!=ch2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(reverse1("Om"));
        System.out.println(reverse2("Rajput"));
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("Rajput"));

        System.out.println(getVowels("om Rajput"));
        printStr("Om Rajput");
        System.out.println("Without length() we are counting length: "+getNum("Om Rajput"));

//        String firstName = "Om";
//        String lastName = new String("Barabhai");
//        System.out.println(firstName+" "+lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(0));
//        System.out.println(firstName.charAt(1));
//        System.out.println(lastName.charAt(2));
//        System.out.println(lastName.length());
//        String str = "Om";
//        String str2 = "OM";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));
//        String st = "   ";
//        System.out.println(st.isBlank());
//        System.out.println(st.isEmpty());
//        String str3 = "   Om   ";
//        System.out.println(str3.length());
//        str3= str3.trim();
//        System.out.println(str3);
//        System.out.println(str3.length());
//        String upperCase = "OM";
//        String lowerCase = "om";
//        System.out.println(upperCase.toUpperCase());
//        System.out.println(lowerCase.toLowerCase());
//
//        String myName = "My Name is Om";
//        System.out.println("startwith: "+myName.startsWith("My Name is Om"));
//        System.out.println("endWith: "+myName.endsWith("Om"));
//
//        System.out.println(myName.substring(3,7));
//        System.out.println(myName.contains("Om"));
//
//        int num = 5123;
//        String valueOf = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(valueOf+2);
//
//        String name = "My Name is Om";
//        char[] crr = name.toCharArray();
//        int idx = 0;
//        for (char ch : crr){
//            System.out.println("Value of char At Index "+idx+" : "+ch);
//            idx++;
//        }

//



    }
}
