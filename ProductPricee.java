class Product 
{
 int pcode;
 string pname;
 double price;
 void setValue(int pc,string pn,double p)
 {
   pcode=pc;
   pname=pn;
   price=p;
 }
}
class ProductPricee
{
  Product p1=new Product();
  Product p2=new Product();  
  Product p3=new Product();

  p1.setValue(1,"Duracell",150);
  p1.setValue(2,"Energizer",109);
  p1.setValue(3,"Exide battery",15000);

  if(p1.price<p2.price)
  {
    if(p3.price<p1.price)
     {
      System.out.println("p3 has the smallest price",+p3.price);
     }
    else
     {
      System.out.println("p1 has the smallest price",+p1.price);
     }
   }
   else
   {
     if(p2.price<p3.price)
      {
         System.out.println("p2 has the smallest price",+p2.price);
      }
     else
      {
        System.out.println("p3 has the smallest price",+p3.price);
      }
    }
}

    
  
