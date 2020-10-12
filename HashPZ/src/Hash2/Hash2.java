package Hash2;

import Hash1.generatorWord;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
    private static String str;
    private static Map<String,String> Hash=new HashMap<>();

    public Hash2(String str){this.str=str+" ";}

    public Map preobrazovanieHash(){
        String str1="";
        char hash;
        int LengthWord=0;
        String Word="";
        int indexWord=0;
        for(int indexSpace=0;indexSpace<str.length();indexSpace++){
            String cLetter=str.substring(indexSpace,indexSpace+1);
            if(cLetter.equals(" ") && Hash.isEmpty()){
                Word=str.substring(indexWord,indexSpace);
                indexWord=indexSpace;
            }else if(cLetter.equals(" ") && !Hash.isEmpty()){
                Word=str.substring(indexWord+1,indexSpace);
                indexWord=indexSpace;
            }
            if(Word==""){
                continue;
            }
            LengthWord=Word.length()*3;
            for (int i=0;i<LengthWord;i++){
                hash= generatorWord.Generation();
                str1=str1+hash;
            }
            Hash.put(Word,str1);
            str1="";
            Word="";
        }
        for(Map.Entry<String,String> item: Hash.entrySet()){
            System.out.println("Word: " + item.getKey()+" hash: "+item.getValue());
        }
        return Hash;
    }
}
