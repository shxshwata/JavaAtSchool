import java.util.Scanner;
public class FlavouredDrinkingWater
{
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    FlavouredDrinkingWater()
    {
        product_code=100;
        pack_size=250;
        product_price=250;
        flavour="Peach";
        pack_type="Bottle";
    }
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the product code: ");
        product_code=sc.nextInt();
        System.out.println("Enter the pack size: ");
        
    }
}