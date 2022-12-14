public class Guests {
    String name;
    String EGN;
    int familyStatus;
    double downtime;
    float price;
    String residence;

    public Guests(String name, String EGN, int familyStatus, double downtime, float price, String residence) {
        this.name = name;
        this.EGN = EGN;
        this.familyStatus = familyStatus;
        this.downtime = downtime;
        this.price = price;
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "name='" + name + '\'' +
                ", EGN='" + EGN + '\'' +
                ", familyStatus=" + familyStatus +
                ", downtime=" + downtime +
                ", price=" + price +
                ", residence='" + residence + '\'' +
                '}';
    }



}
