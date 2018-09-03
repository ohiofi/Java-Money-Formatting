import java.text.DecimalFormat;

public class MoneyFormatting
{
	public static void main(String[] args)
	{
		double foobar = -00000000324.30000000000000003;
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println(money.format(foobar));
		//Will print foobar as "-$324.30"}}
	}
}