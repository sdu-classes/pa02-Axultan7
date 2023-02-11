public class Mainn {
    public static void main(String[] args) {


        Circle c1 = new Circle(6.7 , "yellow" , false);                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());



        Rectangle r1 = new Rectangle(4.1 , 1.5 , "blue" , false);   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


        Square sq1 = new Square(7.4);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());

    }
}
public class Person {
    private String name;
    private String address;

 
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
   
    public void setAddress(String address){
        this.address = address;
    }
   
    @Override
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}

public class Student extends Person {
        private String program;
        private int year;
        private double fee;

      
        public Student(String name, String address, String program, int year, double fee){
            super(name, address);
            this.program = program;
            this.year = year;
            this.fee = fee;
        }
        
        public String getProgram(){
            return this.program;
        }
        public int getYear(){
            return this.year;
        }
        public double getFee(){
            return this.fee;
        }
       
        public void setProgram(String program){
            this.program = program;
        }
        public void setYear(int year){
            this.year = year;
        }
        public void setFee(double fee){
            this.fee = fee;
        }
       
        @Override
        public String toString(){
            return "Student[" + super.toString() + ",program=" + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";
        }
}

    public class Staff extends Person {
        private String school;
        private double pay;

       
        public Staff(String name, String address, String school, double pay){
            super(name, address);
            this.school = school;
            this.pay = pay;
        }
      
        public String getSchool(){
            return this.school;
        }
        public double getPay(){
            return this.pay;
        }
       
        public void setSchool(String school){
            this.school = school;
        }
        public void setPay(double pay){
            this.pay = pay;
        }
       
        @Override
        public String toString(){
            return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay + "]";
        }
    }
