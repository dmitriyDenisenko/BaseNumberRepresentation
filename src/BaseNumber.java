import java.util.Scanner;

public class BaseNumber{
    private String data;
    private int system;

    public BaseNumber(String data, int system) {
        data = data.toLowerCase();
        try {
            Integer.parseInt(data, system);
            this.data = data;
            this.system = system;

        } catch (NumberFormatException ex) {
            System.out.println("Input error");
        }
    }

    public BaseNumber() {
    }

    public String Convert(int newSystem) {
        data = Integer.toString(Integer.parseInt(data, system), newSystem);
        return data;
    }

    public String toDouble() {
        if(data != null){
            return data + ".00";
        } else {
            System.out.println("Error");
        }
        return null;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public String getData() {
        return data;
    }

    public int getSystem() {
        return system;
    }

}

