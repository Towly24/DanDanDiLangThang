package Exam.ex2;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void display(){
        if(getNumber() == 0 || getDestination() == ""){
            System.out.println(0);
        }else {
            System.out.println(getNumber() + ", " +getDestination());

        }
    }
}
