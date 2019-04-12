package by.bsu.lab5;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Shop.Department meat = shop.addDepartment("Мясной отдел");

        Shop.Department.Products meatProduct = meat.addProducts("Мясо");
        Shop.Department.Products sausages = meat.addProducts("Сосиски");
        Shop.Department.Products fish = meat.addProducts("Рыба");

        Shop.Department.Service weigh = meat.addService("Взвесить");
        Shop.Department.Service cut = meat.addService("Разрезать");

        Shop.Department readyProduct = shop.addDepartment("Отдел готовой продукции");

        Shop.Department.Products chop = readyProduct.addProducts("Котлеты");
        Shop.Department.Products stuffedCabbage = readyProduct.addProducts("Голубцы");
        Shop.Department.Products sushi = readyProduct.addProducts("Суши");

        Shop.Department.Service weigh1 = readyProduct.addService("Взвесить");
        Shop.Department.Service put = readyProduct.addService("Наложить");
        Shop.Department.Service sell = readyProduct.addService("Продать");
        Shop.Department.Service cook = readyProduct.addService("Приготовить");


        printShop(shop);
    }

    private static void printShop(Shop shop) {
        for (Shop.Department department : shop.getDepartments()) {
            System.out.println(department.getName());
            System.out.println("Продукты: ");
            for (Shop.Department.Products products : department.getProducts()) {
                System.out.print(products.getName() + " ");
            }
            System.out.println();
            System.out.println("Услуги: ");
            for (Shop.Department.Service service : department.getServices()) {
                System.out.print(service.getName() + " ");
            }
            System.out.println();
            System.out.println("********");
        }
    }
}
