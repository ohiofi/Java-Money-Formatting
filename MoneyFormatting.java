import java.text.DecimalFormat;

public class MoneyFormatting
{
	public static void main(String[] args)
	{
		double foobar = 00000000324.30000000000000003;
		System.out.printf("$%10.2f\n",foobar);
		//Will output "$  -324.30"
		DecimalFormat money = new DecimalFormat("$.00");
		System.out.println(money.format(foobar));
		//Will output "-$324.30"
		
		foobar = -00000000324.30000000000000003;
		System.out.printf("$%10.2f\n",foobar);
		//Will output "$  -324.30"
		System.out.println(money.format(foobar));
		//Will output "-$324.30"
		
		//You CAN combine printf and DecimalFormat
		System.out.printf("%10s\n",money.format(foobar));
		
	}
}