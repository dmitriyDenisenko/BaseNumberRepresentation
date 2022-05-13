import java.util.Locale;

public class FloatingNumber extends BaseNumber{
    private String firstPart;
    private String secondPart;

    public FloatingNumber(String data, int system) {
        data = data.toLowerCase();
        int indexOfPoint = data.indexOf('.');
        firstPart = data.substring(0,indexOfPoint);
        secondPart = data.substring(indexOfPoint + 1);
        try{
            Integer.parseInt(firstPart, system);
            Integer.parseInt(secondPart, system);
            setData(data);
            setSystem(system);
        } catch (NumberFormatException ex) {
            System.out.println("Input error");
        }
    }
    @Override
    public String Convert(int newSystem) {
        firstPart = Integer.toString(Integer.parseInt(firstPart, super.getSystem()), newSystem);
        secondPart = Integer.toString(Integer.parseInt(secondPart, super.getSystem()), newSystem);
        String answer = firstPart + "." + secondPart;
        super.setData(answer);
        return answer;
    }

    @Override
    public String toDouble(){
        return super.getData();
    }

    public String getWholePart(){
        return firstPart;
    }

    public String getFloatingPart(){
        return secondPart;
    }
}
