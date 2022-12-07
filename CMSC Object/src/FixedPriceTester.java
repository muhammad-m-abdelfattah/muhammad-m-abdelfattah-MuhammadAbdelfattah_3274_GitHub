public class FixedPriceTester
{
   public static void main(String[] args)
   {
      AbstractItem item = new FixedPriceItem("Rush charge", 20.00);
      System.out.println(item.getTotalPrice());
      System.out.println("Expected: 20.0");
      System.out.println(item.format());
      System.out.println("Expected: Rush charge                      20.00        20.00");
   }
}


