import java.time.LocalDate;

public class Account {
     int id;
     String email;
     String username;
     String fullName;
     Department department;
     Position position;
     LocalDate createdDate;


     Account () {
     }
     Account (int id, String email, String username, String fullName, String firstname, String lastname) {
          this.id = id;
          this.email = email;
          this.username = username;
          this.fullName = firstname + lastname;

     }

     Account (int id, String email, String username, String fullName, String firstname, String lastname, Position position ) {
          this.id = id;
          this.email = email;
          this.username = username;
          this.fullName = firstname + lastname;
          this.position = position;
          this.createdDate = LocalDate.now();
     }
}
