package lesson4.hometask1;

public class Task1 {
    public static void main(String[] args) {
        String sentence = "abc Cpddd Dio OsfWw";
        StringBuilder result = new StringBuilder(); //"ABCPDIOSFW"
        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

        for (int i = 0; i < sentence.length()-1; i++) {
           if (sentence.charAt(i) != sentence.charAt(i + 1)) {
                result.append(sentence.charAt(i));
           }
        }
        result.append(sentence.charAt(sentence.length()-1));
        System.out.println(result);
    }
}
