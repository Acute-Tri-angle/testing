public class Main {
    public static void main(String[] args) {

        //problem 1
        Person Roachel = new Person();
        System.out.println(Roachel.toString());

        Person Lucas = new Person();
        Lucas.setAge(12);
        Lucas.setName("Lucas");
        Lucas.setHairColor("light brown");
        Lucas.setHeight(2);
        System.out.println(Lucas.toString());

        Person Steve = new Person();
        Steve.setAge(20000);
        Steve.setHairColor("chestnut brown");
        Steve.setHeight(6.2);
        Steve.setName("Steve");
        System.out.println(Steve.toString());
        
        //space between p1 and p2 outputs in terminal
        System.out.println("");
        

        //problem 2
        System.out.println(addNums(70, 7));
        System.out.println(subtractNums(70, 7));
        System.out.println(divideNums(70, 7));
        System.out.println(multiplyNums(70, 7));
    }

    //CALCULATOR
    
    //function that adds two number: x and y
    public static int addNums(int x, int y){
        return (x + y);
    }

    //function that subtracts two number: x and y
    public static int subtractNums(int x, int y){
        return (x - y);
    }

    //function that divides two number: x and y
    public static double divideNums(double x, double y){
        return (x / y);
    }

    //function that multiplies two number: x and y
    public static int multiplyNums(int x, int y){
        return (x * y);
    }
  
  }