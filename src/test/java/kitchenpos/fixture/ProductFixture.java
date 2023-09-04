package kitchenpos.fixture;

import kitchenpos.domain.MenuProduct;
import kitchenpos.domain.Product;

public enum ProductFixture {
    PRODUCT_FIXTURE_DEFAULT("후라이드", 16000);

    private final String name;
    private final int price;

    ProductFixture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product getProduct() {
        Product product = new Product();
        return product;
    }
}
