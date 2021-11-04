// public class Exception_Handling // TryCatch
// {
//     public static void main(String[] args) {
//         try {
//             int data = 50 / 0;
//         } catch (Exception e) {
//             System.out.println(e);
//         } finally {
//             System.out.println("I am in finally block !!");
//         }
//     }
// }

class Exception_Handling { // ThrowsExecp
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
