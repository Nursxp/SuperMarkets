public class Client implements CardInterface {
    private String firstname;
    private String lastname;
    private int age;
    private long card;
    private String basket;

    public Client() {
    }

    public Client(String иван, String иванов, int i, Card card, Basket basket) {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", card=" + card +
                ", basket='" + basket + '\'' +
                '}';
    }

    @Override
    public void payWithCard(double money) {
    }

    @Override
    public void getCardBalance() {

    }

    public void checkout() {
    }
}
