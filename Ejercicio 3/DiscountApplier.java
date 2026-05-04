package tudelft.discount;

import java.util.List;

public class DiscountApplier {
    private ProductDao dao;

    public DiscountApplier(ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {
        List<Product> products = dao.all();

        for (Product product : products) {
            // Comparamos Strings correctamente con .equals()
            if (product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice() * 1.1); // Recargo 10%
            } 
            else if (product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice() * 0.9); // Descuento 10%
            }
        }
    }
}