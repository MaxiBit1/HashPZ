import Hash1.Hash1;
import Hash2.Hash2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tHash1\t");
        Hash1 hash1=new Hash1("П, мама, я - дружная семья");
        hash1.transformation();
        System.out.println("\tHash2\t");
        Hash2 hash2=new Hash2("Папа, мама, я - дружная семья");
        hash2.preobrazovanieHash();
    }
}
