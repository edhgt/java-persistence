package testjpa.persistense;

import java.util.logging.Level;
import java.util.logging.Logger;
import testjpa.logic.Student;
import testjpa.persistense.exceptions.NonexistentEntityException;

public class PersistenceController {
    StudentJpaController studentJpaController = new StudentJpaController();
    
    public void createStudent(Student student) {
        try {
            this.studentJpaController.create(student);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteStudent(int id) {
        try {
            this.studentJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
