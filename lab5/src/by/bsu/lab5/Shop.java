package by.bsu.lab5;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Department> departments = new ArrayList<>();

    public Shop(){
    }

    public Department addDepartment(String name){
        Department department = new Department(name);
        getDepartments().add(department);
        return department;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public class Department{
        private String name;
        private List<Products> products = new ArrayList<>();
        private List<Service> services = new ArrayList<>();

        public Department(String name) {
            this.name = name;
        }

        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }

        public Service addService(String name){
            Service service = new Service(name);
            getServices().add(service);
            return service;
        }

        public Products addProducts(String name){
            Products product = new Products(name);
            getProducts().add(product);
            return product;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Products> getProducts() {
            return products;
        }

        public void setProducts(List<Products> products) {
            this.products = products;
        }

        public class Products{
            private String name;

            public Products(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Products{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        public class Service{
            private String name;

            public Service(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Service{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }
    }
}
