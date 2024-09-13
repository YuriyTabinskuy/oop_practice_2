public class Main {  
    public static void main(String[] args) {  

        Person person = new Person("Marta", 10, "female");  
        person.work();  

        Student student = new Student("Ostap", 20, "male", "LNU", 1);  
        student.work();  

        Cadet cadet = new Cadet("Max", 15, "male", "Radoviy", "LDUBGD");  
        cadet.work();  
    
    System.out.println(person);
    System.out.println(student);
    System.out.println(cadet);
    }
}
