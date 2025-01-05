public class Person{
    public String name;
    private int age;
    private double height;
    private String hairColor;
  
    public Person() { 
        name = "Roachel";
        age = 16;
        height = 6.5;
        hairColor = "bright purple";
      }
  
    //method used to set the age of the person
    public void setAge(int newAge) { 
        age = newAge;
      }
  
    //method used to set the name of the person
    public void setName(String newName) { 
        name = newName;
      }
  
    //method used to set the height of the person (in feet)
    public void setHeight(double newHeight) { 
        height = newHeight;
      }
  
    //method used to set the hair color of the person
    public void setHairColor(String newHairColor) { 
        hairColor = newHairColor;
      }
  
    public String toString() {
        return new String("This person, " + name + ", is " + age + " years old " + " and is " + height +  " feet tall." + " This person's hair color is " + hairColor + ".");
      }
    
  }