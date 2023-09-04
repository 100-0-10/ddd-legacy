package kitchenpos.fixture;

import kitchenpos.domain.MenuGroup;

public enum MenuGroupFixture {

     MENU_GROUP_FIXTURE_DEFAULT("한마리메뉴")
    ,MENU_GROUP_FIXTURE_EMPTY_NAME("")
    ,MENU_GROUP_FIXTURE_NULL_NAME(null);

    private final String name;

    MenuGroupFixture(String name) {
        this.name = name;
    }

    public MenuGroup getMenuGroup() {
        MenuGroup menuGroup = new MenuGroup();
        menuGroup.setName(name);
        return menuGroup;
    }
}
