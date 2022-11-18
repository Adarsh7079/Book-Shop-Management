/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop2;

/**
 *
 * @author adarsh
 */
class User {
    private String id,name,author,quantity,price;
    public User(String id,String name,String author,String quantity,String price)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.quantity=quantity;
        this.price=price;
    }
    public String getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getauthor()
    {
        return author;
    }
    public String getquantity()
    {
        return quantity;
    }
    public String getprice()
    {
        return price;
    }
   
    
    
    
}
