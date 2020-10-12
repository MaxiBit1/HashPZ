package Hash1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Hash1 {
    private final String str;
    private Map<String,String> NewHAsh=new HashMap<String, String>();

    public Hash1(final String str){
        this.str=str+" ";
    }

    public String transformation(){
        int currentIndex=0;
        int IndexSpace=0;
        int IndexLetter=0;
        char HashT;
        String result="";
        String punct=".,-!? ";
        LinkedList<String> PLetter=new LinkedList<>();
        char[] punctuation=punct.toCharArray();
        while(IndexSpace<str.length()){
            String Letter=str.substring(IndexSpace,IndexSpace+1);
            for(int i=0;i<punctuation.length;i++) {
                if(PLetter.isEmpty()){
                    continue;
                }
                else if(PLetter.getLast().charAt(0)==punctuation[i]){
                    IndexLetter=IndexSpace;
                    break;
                }
                else if (Letter.charAt(0) == punctuation[i]) {
                    String sLetter = str.substring(IndexLetter, IndexSpace);
                    while (currentIndex < sLetter.length()) {
                        HashT = generatorWord.Generation();
                        result = result + HashT;
                        currentIndex++;
                    }
                    IndexLetter = IndexSpace + 1;
                    NewHAsh.put(sLetter, result);
                    result = "";
                    currentIndex = 0;
                }
            }
            PLetter.add(Letter);
            IndexSpace++;
        }
        if(NewHAsh.get(result)==NewHAsh.get(result+1)){
            String sWord=str.substring(currentIndex,currentIndex+1);
            while (currentIndex<sWord.length()){
                HashT=generatorWord.Generation();
                result=result+HashT;
                currentIndex++;
            }
        }
        for(Map.Entry<String,String> item:NewHAsh.entrySet()){
            System.out.println("Word: " + item.getKey()+" Hash: "+item.getValue());
        }
        return result;
    }

}