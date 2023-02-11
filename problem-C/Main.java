package object.Homework3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Erke", "Abylaihan 1/1");
        System.out.println(person);
        System.out.println(person.getAddress());
        System.out.println(person.getName());

        Student student = new Student("Medeu", "Askarova 1", "BS", 2, 36600);
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getFee());
        System.out.println(student.getYear());

        Staff staff = new Staff("Axultan", "Abay 19", "Grodekevo", 500000);
        System.out.println(staff);
        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());

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
