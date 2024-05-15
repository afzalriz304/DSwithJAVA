package String.Easy;

public class ReverseSentance {
    public static void main(String[] args) {
        //System.out.println(reverseWords("Let's take LeetCode contest"));
        String name = "Afzal";
        StringBuilder sentence = new StringBuilder();
        sentence.insert(0,name.charAt(3));
        sentence.insert(0,name.charAt(4));
        System.out.println(sentence);
        String re = sentence.substring(0,2);
        String rs = null;
        rs.substring(1,1);
        System.out.println(re);
    }

    public static String reverseWords(String s) {
        String[] sArr = s.split(" ");
        int size = sArr.length;
        int index=0;
        StringBuilder sentence = new StringBuilder();
        int spaces = size-1;
        while(index<size){
            char[] current=sArr[index].toCharArray();

            StringBuilder word = new StringBuilder();
            for(int i=current.length-1;i>=0;i--){
                word.append(current[i]);
            }
            sentence.append(word);
            if(spaces>0)
                sentence.append(" ");

            spaces--;
            index++;
        }
        return sentence.toString();
    }
}
