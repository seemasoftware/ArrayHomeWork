//Write a Java program to find the common elements between two arrays (string
//values)

public class CommonElement {
    public static void main(String[] args){
        String n1[]={"banana","apple","mango","rose"};
        String n2[]={"rose","lilly","lotus","Merrigold"};

        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                if(n1[i].equals(n2[j])){
                    System.out.println(n1[i]);
                    break;
                }
            }
        }

    }
}
