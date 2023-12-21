

public class MethodLessoon {

    static boolean isPolidrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while (temp != 0){
           // System.out.println("=============");
          //  System.out.println("number =>"+temp);
            lastNumber=temp % 10;
          //  System.out.println("last Number =>"+lastNumber);
            reverseNumber=(reverseNumber * 10)+lastNumber;
          //  System.out.println("New Number =>"+reverseNumber);
            temp/=10;// Gelen sayiyi 10 bölerek azaltmak için böyle yeni değeri için 10 a böldük .
        }
        if (number==reverseNumber){
            System.out.println("Polidrom number : "+true);
        }else {
            System.out.println(" Not polidrom :"+false);
        }

    return true;
    }




    public static void main(String[] args) {
isPolidrom(101);



    }
}


