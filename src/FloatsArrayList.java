import java.util.ArrayList;

/**
 * Created by Thiago Bomfim
 * on 1/5/17.
 */
public class FloatsArrayList {
    public static void main(String[] args) {
        ArrayList<Float> fishLengthList = new ArrayList<Float>();
        fishLengthList.add(10.0f);
        fishLengthList.add(15.5f);
        fishLengthList.add(18.0f);
        fishLengthList.add(29.5f);
        fishLengthList.add(45.5f);

        float requiredLength=28;

        for (float f: fishLengthList){
            if (f >= 28f)
                System.out.println(f);
        }
        
    }
}
