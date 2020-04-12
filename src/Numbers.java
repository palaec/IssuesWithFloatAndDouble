import java.math.BigDecimal;

public class Numbers {

 public float mathsWithFloats(float a , float b){
	return a-b;
	 
 }

public float mathsWithFloatsLoop(float f) {
	
	 float total = 0.2f;
     for (int i = 1; i < 100; i++) {
         total = total + f;
     }
     System.out.println("total using float = " + total);
     return total;
}


public BigDecimal mathsWithFloatsLoopBig(float f) {
	
	 BigDecimal total = new BigDecimal(Float.toString(0.20f));
    for (int i = 1; i < 100; i++) {
        total = total.add(new BigDecimal(Float.toString(f)));
    }
    System.out.println("total using Big = " + total);
    return total;
}

}
