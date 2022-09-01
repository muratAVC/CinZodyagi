import java.util.Scanner;

public class CinZo {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        String burc="";
        System.out.println("Çin zodyağı için doğum yılınızı giriniz");
        int dogumyili= girdi.nextShort();
        dogumyili=dogumyili%12;
        switch (dogumyili){
            case 0: burc="Maymun"; break;
            case 1: burc="Horoz"; break;
            case 2: burc="Köpek"; break;
            case 3: burc="Domuz"; break;
            case 4: burc="Fare"; break;
            case 5: burc="Öküz"; break;
            case 6: burc="kaplan"; break;
            case 7: burc="tavşan"; break;
            case 8: burc="Ejderha"; break;
            case 9: burc="yılan"; break;
            case 10: burc="At"; break;
            case 11: burc="Koyun"; break;
        }

        System.out.println("Çin Zodyağı Burcunuz -->"+burc);



    }
}
