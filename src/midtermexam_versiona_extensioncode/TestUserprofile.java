

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author LeahKim
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        After cloning the code, Create a class called TestUserprofile with main method  where a user wants to create a new profile. 
        The user will enter their name and choose their favourite Genre from a displayed list of the possible Genres. 
        The user will then see a message that their userProfile was created. 
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user's name");
        String name = input.nextLine();
        System.out.println("Choose your favorite genre: Comedy, Drama, Action, Mystery");
        String genre = input.nextLine();
        
        UserProfile pro1 = new UserProfile(name, genre);
        
        System.out.printf("User profile successfully created. the user's name is %s who has a favorie genre of %s", pro1.getUserName(), pro1.getGenre());
    }
    

}
