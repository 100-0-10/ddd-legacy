package kitchenpos.fixture;

import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuGroup;

import java.math.BigDecimal;

public enum MenuFixture {

//    MENU_FIXTURE_DEFAULT("후라이드치킨", BigDecimal.valueOf(16000), MenuGroupFixture.MENU_GROUP_FIXTURE_DEFAULT.getMenuGroup(), true, MenuProductFixture.MENU_PRODUCT_FIXTURE_DEFAULT.getMenuProducts());
    MENU_FIXTURE_DEFAULT("후라이드치킨", BigDecimal.valueOf(16000), MenuGroupFixture.MENU_GROUP_FIXTURE_DEFAULT.getMenuGroup(), true);

    private final String name;
    private final BigDecimal price;
    private final MenuGroup menuGroup;
    private final boolean displayed;
//    private final List<MenuProduct> menuProducts;

    MenuFixture(String name, BigDecimal price, MenuGroup menuGroup, boolean displayed) {
        this.name = name;
        this.price = price;
        this.menuGroup = menuGroup;
        this.displayed = displayed;
//        this.menuProduct = menuProduct;
    }

    public Menu getMenu() {
        Menu menu = new Menu();
        menu.setName(this.name);
        menu.setPrice(this.price);
        menu.setMenuGroup(this.menuGroup);
        menu.setDisplayed(this.displayed);
//        menu.setMenuProducts(menuProduct);
        return menu;
    }
}
