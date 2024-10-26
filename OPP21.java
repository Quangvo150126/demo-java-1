public class OPP21{
    private String name;
    private String mail;
    private char gender;
    public OPP21(String name, String mail, char gender) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }
    public String getName() {
        return name;

    }
    public String getMail() {
        return mail;
    }
    public char getGender() {
        return gender;
    }
    public void setmail(String mail) {
        this.mail = mail;
    }
    public String toString() {
        return name + " " + mail + " " + gender;
    }

}
