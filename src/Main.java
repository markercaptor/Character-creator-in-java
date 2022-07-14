/**
 * <h1>Main</h1>
 * In this file all of the character info is gained from the users input as well as validation so they cannot enter non valid info
 */
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Characterclass character = new  Characterclass();//new class creation
        String name;//variables for user input
        String gender;
        String characterClass;
        String race;
        int Strength;
        int Dexterity;
        int Constitution;
        int Intelligence;
        int Wisdom;
        int Charisma;


        try
        {
            System.out.println("Please enter name: ");//print outs for info and user prompts
            Scanner S = new Scanner(System.in);//scanners for user input
            name = S.nextLine();//reads in what is typed into variable
            character.setCharactername(name);
            System.out.println("\nAvailable Genders");
            System.out.println("\n**************");
            System.out.println("\nMale");
            System.out.println("\nFemale");
            System.out.println("\n**************");
            System.out.println("\nPlease enter gender: ");
            gender = S.nextLine();
            while(!gender.equals("Male") && !gender.equals("Female")  )//checker/validator for gender
            {
                System.out.println("\nPlease enter a gender from above: ");
                gender = S.nextLine();
            }
            character.setCharactergender(gender);
            System.out.println("\nAvailable classes");
            System.out.println("\n**************");
            System.out.println("\nFighter");
            System.out.println("\nPaladin");
            System.out.println("\nRanger");
            System.out.println("\nWizard");
            System.out.println("\nThief");
            System.out.println("\n**************");
            System.out.println("Please choose your class: ");
            characterClass = S.nextLine();

            while(!characterClass.equals("Fighter") && !characterClass.equals("Paladin") && !characterClass.equals("Ranger") && !characterClass.equals("Wizard") && !characterClass.equals("Thief") )
            {//validator for characters class
                System.out.println("\nPlease enter a class from above: ");
                characterClass = S.nextLine();
            }
            character.setcharacterClass(characterClass);

            System.out.println("\nAvailable races");
            System.out.println("\n**************");
            System.out.println("\nHuman");
            System.out.println("\nDragonborn");
            System.out.println("\nHighlander");
            System.out.println("\nKhajiit");
            System.out.println("\n**************");
            System.out.println("Please choose your race: ");
            race = S.nextLine();

            while(!race.equals("Human") && !race.equals("Dragonborn") && !race.equals("Highlander") && !race.equals("Khajiit") )
            {//validator for race
                System.out.println("\nPlease enter a race from above: ");
                race = S.nextLine();
            }
            character.setRace(race);

            System.out.println("Please enter your strength: ");
            Strength = S.nextInt();
            character.setStrength(Strength);
            System.out.println("Please enter your dexterity: ");
            Dexterity = S.nextInt();
            character.setDexterity(Dexterity);
            System.out.println("Please enter your constitution: ");
            Constitution = S.nextInt();
            character.setConstitution(Constitution);
            System.out.println("Please enter your intelligence: ");
            Intelligence = S.nextInt();
            character.setIntelligence(Intelligence);
            System.out.println("Please enter your wisdom: ");
            Wisdom = S.nextInt();
            character.setWisdom(Wisdom);
            System.out.println("Please enter your Charisma: ");
            Charisma = S.nextInt();
            character.setCharisma(Charisma);
            character.summation();

            System.out.println(character.toString());
        }
        catch(Exception e)
        {
            System.out.println("Error caught");
        }












    }





}
