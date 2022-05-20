package sale;

public class SilverCustomer extends CustomerTest{
    public SilverCustomer(String id,int amount){
        super(id, amount);
    }
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-backMoney()+"("+backMoney()+")"));
    }

}
