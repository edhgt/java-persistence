package testjpa.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import testjpa.persistense.PersistenceController;

public class TestJPA {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Student student = new Student();
            
            System.out.println("*******".repeat(7) + "School system" + "*".repeat(7));
            System.out.println("Enter dni:");
            student.setDni(input.nextLine());
            
            System.out.println("Enter firstname:");
            student.setFirstName(input.nextLine());
            
            System.out.println("Enter lastname:");
            student.setLastName(input.nextLine());
            
            System.out.println("Enter birthday (yyyy-mm-dd):");
            student.setBirthday(new SimpleDateFormat("yyyy-mm-dd").parse(input.next()));
            
            
            PersistenceController persistenceController = new PersistenceController();
            persistenceController.createStudent(student);
            
            System.out.println(student);
        } catch (ParseException ex) {
            Logger.getLogger(TestJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
