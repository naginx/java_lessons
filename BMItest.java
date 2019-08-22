import java.io.*;

public class BMItest {
    public static void main(String[] args){
        double h, w, bmi;

        try {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            System.out.println("This is a judging program of BMI");
            System.out.print("Please specify height (cm): ");
            h = Double.parseDouble(br.readLine());
            System.out.print("Please specify your weight (kg):");
            w = Double.parseDouble(br.readLine());

            h *= 0.01;
            bmi = w / (h*h);

            System.out.println("Your BMI is" + Math.round(bmi*10.0)/10.0);
            if(bmi < 18.5)      System.out.println("thin type");
            else if(bmi < 25.0) System.out.println("standard type");
            else                System.out.println("Obase type");
            br.close();
        } catch(Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}