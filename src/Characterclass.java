/**
 * <h1>Holds all info on characters</h1>
 * In this file all of the character data is held and is made usable
 */
public class Characterclass
{
    String characterClass;//variables for holding character data
    String Charactername;
    String Charactergender;
    String Race;
    int Strength;
    int Dexterity;
    int Constitution;
    int Intelligence;
    int Wisdom;
    int Charisma;
    int Total;

    public Characterclass(){//constructor

    }



    public Characterclass(String Characlass, String Charaname, String Charagender
    , String Races, int Streng, int Dex, int Const, int Intel
    , int Wis, int Chari)
    {//overridden constructor
        this.characterClass = Characlass;//this pointers to assign values to variables from main
        this.Charactername = Charaname;
        this.Charactergender = Charagender;
        this.Race = Races;
        this.Strength = Streng;
        this.Dexterity = Dex;
        this.Constitution = Const;
        this.Intelligence = Intel;
        this.Wisdom = Wis;
        this.Charisma = Chari;
    }

    public String getcharacterClass() {
        return characterClass;
    }//gets info on characterClass

    public void setcharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }//sets teh characterClass

    public String getCharactername() {
        return Charactername;
    }//get info for Charactername

    public void setCharactername(String charactername) {
        Charactername = charactername;
    }//sets Charactername

    public String getCharactergender() {
        return Charactergender;
    } //get info for Gender

    public void setCharactergender(String charactergender) {
        Charactergender = charactergender;
    }//sets Gender

    public String getRace() {
        return Race;
    } //get info for Race

    public void setRace(String race) {
        Race = race;
    }//sets Race

    public int getStrength() {
        return Strength;
    } //get info for Strength

    public void setStrength(int strength) {
        Strength = strength;
    }//sets Strength

    public int getDexterity() {
        return Dexterity;
    } //get info for Dexterity

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }//sets Dexterity

    public int getConstitution() {
        return Constitution;
    } //get info for Constitution

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }//sets Constitution

    public int getIntelligence() {
        return Intelligence;
    } //get info for Intelligence

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }//sets Intelligence

    public int getWisdom() {
        return Wisdom;
    } //get info for Wisdom

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }//sets Wisdom

    public int getCharisma() {
        return Charisma;
    } //get info for Charisma

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }//sets Charisma

    public void summation()// gives total for attribute points
    {
        Total = Strength+Dexterity+Constitution+Intelligence+Wisdom+Charisma;

    }


    public String toString() //prints out character sheet/details
    {
        return "Name: " + this.Charactername + "\nGender: " + this.Charactergender + "\nCharacter Class: " + this.characterClass
                + "\nRace: " + this.Race + "\nSTR: " + this.Strength + "\nDEX: " + this.Dexterity + "\nCON: " + this.Constitution
                + "\nINT: " + this.Intelligence + "\nWIS: " + this.Wisdom + "\nCHA: " + this.Charisma + "\n\n Total: " +this.Total;
    }



}
