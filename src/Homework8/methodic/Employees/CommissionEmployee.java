package Homework8.methodic.Employees;

public class CommissionEmployee extends Employee{
    int soldProducts;
    int priceOneProduct;

    public CommissionEmployee(int id, String name, int soldProducts,int priceOneProduct) {
        super(id, name);
        this.soldProducts = soldProducts;
        this.priceOneProduct = priceOneProduct;
    }

    @Override
    public float calculateSalary() {
        return soldProducts*priceOneProduct;
    }
}
