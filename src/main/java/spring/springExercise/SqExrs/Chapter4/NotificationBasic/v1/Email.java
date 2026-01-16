package spring.springExercise.SqExrs.Chapter4.NotificationBasic.v1;


import org.springframework.stereotype.Component;

@Component
public class Email {
    String text;
    String whom;
    String address;
    int streetNumbers;

    public Email() {
    }

    public Email(String text, String whom, String address, int streetNumbers) {
        this.text = text;
        this.whom = whom;
        this.address = address;
        this.streetNumbers = streetNumbers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStreetNumbers() {
        return streetNumbers;
    }

    public void setStreetNumbers(int streetNumbers) {
        this.streetNumbers = streetNumbers;
    }

    @Override
    public String toString() {
        return "Email{" +
                "text='" + text + '\'' +
                ", whom='" + whom + '\'' +
                ", address='" + address + '\'' +
                ", streetNumbers=" + streetNumbers +
                '}';
    }

    public void send(){
        System.out.println("Send to this "+toString());
    }
}
