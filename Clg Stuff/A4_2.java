import java.util.Scanner;

public class A4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direcTory = "java";
        int numberOfFiles, i, j;
        System.out.print("Enter The Number Of Files You Will As Input : ");
        numberOfFiles = sc.nextInt();
        System.out.print("Enter The Files Name : ");
        String[] files = new String[numberOfFiles];
        for (i = 0; i < numberOfFiles; i++) {
            System.out.print("File " + (i + 1) + " : ");
            files[i] = sc.nextLine();
        }
        System.out.print("Java Directory Files Are : ");
        for (i = 0; i < numberOfFiles; i++) {
            for (j = 0; j < files[i].length(); j++) {
                int length = 0;
                char index = files[i].charAt(j);
                int enter = Character.compare('.', index);
                if (enter == 0) {
                    int frontind = j + 1, k = 0;
                    while (frontind < files[i].length() && k < 4) {
                        int index1 = Character.compare(files[i].charAt(frontind), direcTory.charAt(k));
                        if (index1 == 0) {
                            length++;
                        }
                        if (length == 4) {
                            break;
                        }
                        frontind++;
                        k++;
                    }
                    if (length == 4 && frontind == files[i].length() - 1) {
                        System.out.print(files[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}