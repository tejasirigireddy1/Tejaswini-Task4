package Estimate;
import java.util.*;
public class Estimation {
	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in);
		System.out.format("standard\nabove standard\nhigh standard\nhigh standard and fully automated\nenter standard : ");
		String InputStandard=w.nextLine();
		System.out.format("enter Area of house in square feet:");
		double AreaOfHouse=w.nextDouble(),EstimatedCost;
		if(InputStandard.equalsIgnoreCase("standard"))
			EstimatedCost=AreaOfHouse*1200;
		else if(InputStandard.equalsIgnoreCase("above standard"))
			EstimatedCost=AreaOfHouse*1500;
		else if(InputStandard.equalsIgnoreCase("high standard"))
			EstimatedCost=AreaOfHouse*1800;
		else if(InputStandard.equalsIgnoreCase("high standard and fully automated")) 
			EstimatedCost=AreaOfHouse*2500;
		else
			EstimatedCost=0;
		System.out.format("Estimated cost is : %.2f",EstimatedCost);
	}
}