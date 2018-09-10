import java.text.DecimalFormat;

public class MoneyFormatting
{
	public static void main(String[] args)
	{
		double foobar = 00000000324.30000000000000003;
		System.out.printf("$%10.2f\n",foobar);
		//Will output "$    324.30"

		//Create a decimal format called money
		DecimalFormat money = new DecimalFormat("$.00");
		System.out.println(money.format(foobar));
		//Will output "$324.30"

		double negativeFoobar = -00000000324.30000000000000003;
		System.out.printf("$%10.2f\n",negativeFoobar);
		//Will output "$   -324.30"
		System.out.println(money.format(negativeFoobar));
		//Will output "-$324.30"

		//You CAN combine printf AND DecimalFormat
		System.out.printf("%10s\n",money.format(foobar));
		//Will output "   $324.30"
		System.out.printf("%10s\n",money.format(negativeFoobar));
		//Will output "  -$324.30"
	}
}