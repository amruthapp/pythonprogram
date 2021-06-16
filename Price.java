class Product
{
  int pcode;
  string pname;
  double price;
  Product(int pc,string pn,double p)
  {
   pcode=pc;
   pname=pn;
   price=p;    
   }
   string lowprice(Product p1,Product p2,Product p3)
   {
    if(p1.price<p2.price&&p1.price<p3.price)
    {
     return p1.pname;
    }
    else if(p2.price<p1.price&&p2.price<p3.price)
    {
     return p2.name;
    }
    else
    {
     return p3.name;
    }

class Price
{
 public static void main(String args[])
 {
  Product p1=new Product(101,"book1",200);
  Product p2=new Product(102,"book2",300);
  Product p3=new Product(105,"book6",600);

  String lwprice;
  lwprice=p1.lowprice(p1,p2,p3);
  System.out.println("the product with lowest price",+lwprice);
 }
}