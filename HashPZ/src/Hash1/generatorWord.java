package Hash1;

public class generatorWord {
    public static char Generation(){
        char preobras;
        int max=59;
        int min=0;
        int range=(max-min)+1;
        int i= (int)(Math.random()*range)+min;
        String englishNumberWords= "abcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRSTUVWXY1234567890";
        char[] ArrayNumber=englishNumberWords.toCharArray();
        preobras=ArrayNumber[i];
        return preobras;
    }
}