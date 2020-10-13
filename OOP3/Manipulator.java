package OOP3;

import java.util.HashMap;   //Pls no, what the hell is this
import java.util.LinkedList;
import java.util.Map;

public class Manipulator {
    public int Sentences(String text){
        String[] SentenceCheck = text.split("[.]");
        return SentenceCheck.length;
    }

    public int Words(String text){
        String[] SentenceCheck = text.split("[ ,.]");
        return SentenceCheck.length;
    }

    public int Characters(String text){
        int Characters = 0;
        for (int i=0;i<text.length();i++)
            if (Character.isLetter(text.charAt(i)))
                Characters++;
        return Characters;
    }

    public int Vowels(String text){
        int Characters = 0;
        for (int i=0;i<text.length();i++)
            if ("AEIOUaeiou".indexOf(text.charAt(i)) != -1)
                Characters++;
        return Characters;
    }

    public int Consonants(String text){
        int Characters = 0;
        for (int i=0;i<text.length();i++)
            if ("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(text.charAt(i)) != -1)
                Characters++;
        return Characters;
    }

    public void OftenWords(String text){
        HashMap<String, Integer> lengthWords = new HashMap<>();
        String[] SentenceCheck = text.split("[ ,.]");
        int Appearances = 0;
        for (String checkOft : SentenceCheck) {
            if(!checkOft.equals("")){
                if(lengthWords.get(checkOft) != null){
                    lengthWords.put(checkOft, lengthWords.get(checkOft) + 1);
                    if(lengthWords.get(checkOft) > Appearances)
                        Appearances = lengthWords.get(checkOft);
                }else
                    lengthWords.put(checkOft, 1);
            }
        }

        LinkedList<String> Top_5 = new LinkedList<>();
        for(int i=lengthWords.size(); i>=1; i--){
            for (Map.Entry mapEntry : lengthWords.entrySet()) {
                if(mapEntry.getValue().equals(Appearances))
                    Top_5.push((String) mapEntry.getKey());
                if(Top_5.size() >= 5) break;
            }
            Appearances --;
            if(Top_5.size() >= 5) break;
        }
        System.out.println("Top 5 most frequent words:");
        for (String el: Top_5) {
            System.out.println(el);
        }
    }

    public String LongestWord(String text){
        String[] SentenceCheck = text.split("[ ,.]");
        int maxLen = 0, idx = 0;
        for (int i=0;i<SentenceCheck.length;i++){
            if(SentenceCheck[i].length() > maxLen){
                maxLen = SentenceCheck[i].length();
                idx = i;
            }
        }
        return SentenceCheck[idx];
    }

}