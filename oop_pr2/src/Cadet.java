public class Cadet extends Person {
    private String rank;
    private String academy;

    public Cadet(String name, int age, String gender, String rank, String academy) {
        super(name, age, gender); 
        this.rank = rank;
        this.academy = academy;
    }

    @Override
    public void work() {
        System.out.println("Rank: " + rank + ", Academy: " + academy);
        System.out.println("Cadet is training");
    }
}
