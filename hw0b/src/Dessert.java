public class Dessert {
    //静态变量 ： 所有Dessert 对象共享的计数器
    static int numDesserts  =0; //甜品对象数量

    //实例变量
    int flavor;  //口味
    int price;   //价格

    //构造器:设置实例变量，并递增计数器
    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }
    //打印口味 价格 数量（甜点）
    public void printDessert() {
        System.out.println(flavor+" " + price +" " +numDesserts);
    }
    //只打印一行固定文本
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
