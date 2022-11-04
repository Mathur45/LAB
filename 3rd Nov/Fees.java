public class Fees {

public void validateFees(Double Fees) {
 if(Fees.isInfinite()) {

System.out.println("Fees is infinite");
 }
else{
System.out.println("Fees is not infinite");
}
System.out.println(Fees.byteValue());
}
public static void main(String[] args) {
Fees ob = new Fees(); 
ob.validateFees (99999d);

}
}}