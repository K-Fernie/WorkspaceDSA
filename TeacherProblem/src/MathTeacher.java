public class MathTeacher extends Teacher{

    private final String subject;

    public MathTeacher(String name, int ID, String subject, String subject1) {
        super(name, ID);
        this.subject = subject1;
    }

    public String getSubject(){
        return this.subject;
    }
}
