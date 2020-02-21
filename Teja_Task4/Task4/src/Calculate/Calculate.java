package Calculate;
import java.util.*;
public class Calculate {
	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in); 
		System.out.format("enter principal amount:");
		double PrincipalAmount=w.nextDouble();
		System.out.format("enter rate of intrest:");
		double InterestRate=w.nextDouble();
		System.out.format("enter time:");
		int numberOfYears=w.nextInt();
		double SimpleIntrest,CompoundIntrest;
		SimpleIntrest=PrincipalAmount*numberOfYears*(InterestRate/100);
		CompoundIntrest=PrincipalAmount*(Math.pow(1+(InterestRate/100),numberOfYears))-PrincipalAmount;//compounded annually
		System.out.format("SimpleIntrest is:%.2f\n",SimpleIntrest);
		System.out.format("CompoundIntrest is:%.2f\n",CompoundIntrest);
	}
}