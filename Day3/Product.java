class ProductName{
  String pname;
  String id;
  double price;
  Product(String pname,String id,double price){
    this.pname=pname;
    this.id=id;
    this.price=price;
  }
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
  
}
class Product{
  ArrayList<Product> Products=new ArrayList<Product>();
}