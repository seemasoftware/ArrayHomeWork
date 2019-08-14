//Write a Java program to find the duplicate values of an array of integer values.
public class Duplicate {
    public static void main(String[] args){
        int b[]={2,4,6,8,2};

        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {if((b[i]==b[j]) && (i != j)){
                System.out.println("Duplicate Element :"+b[j]);
            }

            }

        }
    }
}
