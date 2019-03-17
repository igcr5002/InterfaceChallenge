import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Player cristi = new Player ("Cristi",100,"Dagger","Increased agility");

		System.out.println(cristi.toString());
		cristi.weapon = "Sword";
		cristi.save();
		System.out.println(cristi.toString());
		cristi.load(readValues());
		System.out.println(cristi.toString());

		Enemy alex = new Enemy("Alex",150,"Legendary sword","Super attack", 1000);
		System.out.println(alex.toString());
		alex.health = 300;
		alex.save();
		System.out.println(alex.toString());
		alex.mainSkill = "Enrage";
		alex.save();
		System.out.println(alex.toString());
		
		
	}

	
	public static ArrayList<String> readValues() {

        	ArrayList<String> values = new ArrayList<String>();


	        Scanner scanner = new Scanner(System.in);

        	boolean quit = false;

        	int index = 0;

        	System.out.println("Choose\n" +

                	"1 to enter a string\n" +

                	"0 to quit");


        	while (!quit) {

        	    System.out.print("Choose an option: ");

        	    int choice = scanner.nextInt();

        	    scanner.nextLine();

        	    switch (choice) {

        	        case 0:

        	            quit = true;

        	            break;

        	        case 1:

        	            System.out.print("Enter a string: ");

        	            String stringInput = scanner.nextLine();

        	            values.add(index, stringInput);

        	            index++;

        	            break;
        	    }

        	}

        	return values;

    	}
}
