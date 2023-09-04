package kitchenpos.fixture;

import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuGroup;
import kitchenpos.domain.MenuProduct;
import kitchenpos.domain.Product;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public enum MenuProductFixture {
    MENU_PRODUCT_FIXTURE_DEFAULT(1, ProductFixture.PRODUCT_FIXTURE_DEFAULT.getProduct(), MenuFixture.MENU_FIXTURE_DEFAULT.getMenu());

    private final int quantity;
    private final Product product;
    private final Menu menu;


    MenuProductFixture(int quantity, Product product, Menu menu) {
        this.quantity = quantity;
        this.product = product;
        this.menu = menu;
    }

    public MenuProduct getMenuProduct() {
        MenuProduct menuProduct = new MenuProduct();
        return menuProduct;
    }

//    public List<MenuProduct> getMenuProducts() {
//        return Arrays.stream(MenuProductFixture.values())
//                .map(x -> {
//                    MenuProduct menuProduct = new MenuProduct();
//                    menuProduct.set
//                    return
//                })
//                .;
//    }
}
