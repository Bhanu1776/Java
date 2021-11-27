import java.util.Scanner;

class PassLen extends Exception {
    @Override
    public String getMessage() {
        return "Please Enter the 8-digit Password";
    }
}

class PassChk extends Exception {
    @Override
    public String getMessage() {
        return "Password Should Contain One-Digit And One Special Symbol.";
    }
}

public class Exp13 {
    public static void main(String[] args) {
        
        String LoginID;
        String Password;
        int SpeSym = 0;
        int Digit = 0;
        int PassLen, i = 0;
        int start = 0, end = 9;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Login Id : ");
        LoginID = sc.next();
        System.out.print("Enter The Password : ");
        Password = sc.next();
        PassLen = Password.length();
        if (PassLen > 8) {
            try {
                throw new PassLen();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        while (i < PassLen) {
            switch (Password.charAt(i)) {
                case '@':
                case '#': {
                    SpeSym++;
                    break;
                }
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0': {
                    Digit++;
                    break;
                }
            }
            i++;
        }
        if ((Digit == 0 && SpeSym == 0) || (Digit > 0 && SpeSym == 0) || (Digit == 0 && SpeSym > 0)) {
            try {
                throw new PassChk();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        } else {
            System.out.println("Login Successfully!");
        }
    }
}