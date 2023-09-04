package kitchenpos.application;

import kitchenpos.domain.MenuGroup;
import kitchenpos.domain.MenuGroupRepository;
import kitchenpos.fixture.MenuGroupFixture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("메뉴 그룹 테스트")
public class MenuGroupTest {

    @Mock
    private MenuGroupRepository menuGroupRepository;
    @InjectMocks
    private MenuGroupService menuGroupService;

    @Nested
    @DisplayName("메뉴 그룹 생성")
    class 메뉴_그룹_생성 {
        @Test
        @DisplayName("성공")
        void 성공() {
            // given
            MenuGroup menuGroup = MenuGroupFixture.MENU_GROUP_FIXTURE_DEFAULT.getMenuGroup();

            // when
            when(menuGroupRepository.save(any())).thenReturn(menuGroup);
            MenuGroup createMenuGroup = menuGroupService.create(menuGroup);

            // then
            assertEquals(menuGroup.getName(), createMenuGroup.getName());
        }

        @DisplayName("실패")
        class 실패 {
            @Test
            @DisplayName("빈값 또는 없음")
            void 메뉴_그룹_생성_실패_이름_빈값_또는_없음() {
                // given
                MenuGroup emptyMenuGroup = MenuGroupFixture.MENU_GROUP_FIXTURE_EMPTY_NAME.getMenuGroup();
                MenuGroup nullMenuGroup = MenuGroupFixture.MENU_GROUP_FIXTURE_NULL_NAME.getMenuGroup();

                // when/then
                assertThrows(IllegalArgumentException.class, () -> {
                    menuGroupService.create(emptyMenuGroup);
                    menuGroupService.create(nullMenuGroup);
                });
            }

        }
    }

}
