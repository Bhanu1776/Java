// class Main {
//     private String name;
//     // constructor
//     Main() {
//       System.out.println("Constructor Called:");
//       name = "Programiz";
//     }
//     public static void main(String[] args) {
//       // constructor is invoked while
//       // creating an object of the Main class
//       Main obj = new Main();
//       System.out.println("The name is " + obj.name);
//     }
//   }

class Main {
  String languages;
    // constructor accepting single value
    Main(String lang) {
      languages = lang;
      System.out.println(languages + " Programming Language");
    }
    public static void main(String[] args) {
      // call constructor by passing a single value
      Main obj1 = new Main("Java");
      Main obj2 = new Main("Python");
      Main obj3 = new Main("C");
    }  }
   