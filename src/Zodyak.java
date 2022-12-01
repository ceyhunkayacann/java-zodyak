import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        int birth;
        int result;
        String zodyak = null;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılı : ");
        birth = input.nextInt();

        result = birth % 12;

        switch (result){
            case 0 :
                zodyak = "Maymun";
                break;
            case 1 :
                zodyak = "Horoz";
                break;
            case 2 :
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşam";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;

        }

        System.out.println("Çin Zodyağı Burcunuz : " + zodyak);
    }
}
