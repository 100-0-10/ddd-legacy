package kitchenpos.application;

import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuGroupRepository;
import kitchenpos.domain.MenuRepository;
import kitchenpos.domain.ProductRepository;
import kitchenpos.fixture.MenuFixture;
import kitchenpos.infra.PurgomalumClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@DisplayName("메뉴 테스트")
public class MenuTest {

    @Mock
    private MenuRepository menuRepository;
    @Mock
    private MenuGroupRepository menuGroupRepository;
    @Mock
    private ProductRepository productRepository;
    @Mock
    private PurgomalumClient purgomalumClient;
    @InjectMocks
    private MenuService menuService;

    @Test
    void 메뉴_생성_성공() {
        // given
        Menu menu = MenuFixture.MENU_FIXTURE_DEFAULT.getMenu();

    }

    @Test
    void 메뉴_생성_실패() {

    }

    @Test
    void 메뉴_가격_변경() {

    }
    @Test
    void 메뉴_표출() {

    }
    @Test
    void 메뉴_숨김() {

    }

}
