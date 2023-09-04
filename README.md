### 공통 예외처리
- 모든 값을 조회할 때 없는 경우 NoSuchElementException 예외로 처리한다.
- 모든 값을 비교할 때에는 IllegalArgumentException 예외로 처리한다.
- 모든 상태를 비교할 때에는 IllegalStateException 예외로 처리한다.

# 메뉴 그룹
##### 메뉴 그룹에는 이름만 있다.
- 메뉴 그룹 생성
  - 이름은 필수값이다.
- 메뉴 그룹 전체 조회

# 메뉴
##### 메뉴에는 메뉴 그룹, 이름, 가격, 메뉴 표출 여부, 메뉴 상품이 있다.
- 메뉴 생성
  - 메뉴 그룹은 필수값이다.
  - 가격은 필수값이며 0 이상이어야 한다.
  - 메뉴 상품은 필수값이며 무조건 한 개 이상이 있어야 한다.
  - 메뉴 가격은 메뉴 상품의 총 가격보다 크거나 같을 수 없다.
  - 이름은 필수값이며 비속어는 들어갈 수 없다.
- 메뉴 가격 변경
  - 가격은 필수값이며 0 이상이어야 한다.
  - 메뉴 가격은 메뉴 상품의 총 가격보다 크거나 같을 수 없다.
- 메뉴 표출
  - 메뉴 가격은 메뉴 상품의 총 가격보다 크거나 같을 수 없다.
- 메뉴 숨김
  - 메뉴를 숨긴다.
- 메뉴 전체 조회
 
# 메뉴 상품
##### 메뉴 상품에는 상품, 상품 수가 있다.

# 상품
##### 상품에는 이름과 가격이 있다.
- 상품 생성
  - 가격은 필수값이며 0 이상이어야 한다.
  - 이름은 필수값이며 비속어는 들어갈 수 없다.
- 상품 가격 변경
  - 가격은 필수값이며 0 이상이어야 한다.
  - 상품이 포함된 모든 메뉴는 메뉴 가격이 메뉴 상품의 총 가격보다 크면 메뉴는 표출하지 않는다.
- 상품 전체 조회

# 주문 플로우
##### 주문 시 배달, 포장, 매장식사로 진행할 수 있다.
### 주문 생성 공통
- 주문 타입은 필수값이다.
- 주문한 메뉴는 필수값이며 무조건 한 개 이상 있어야 한다.
- 주문한 메뉴는 표출 상태여야 한다.
- 주문한 메뉴 가격이 원래의 메뉴 가격과 다른 경우 주문이 안된다.
- 초기 주문 상태는 대기 상태이다.

### 주문 수락 공통
- 수락 시 상태는 대기 상태여야만 한다.
- 수락 상태로 변경한다.

### 주문 서빙 공통
- 서빙완료 시 상태는 수락 상태여야만 한다.
- 서빙완료 상태로 변경한다.

### 배달 (DELIVERY)
- 주문 생성
  - 주문한 메뉴 수는 0개 이상이어야 한다.
  - 주소는 필수값이다.
- 주문 수락
  - 주문한 메뉴들의 가격 합과 주소를 클라이언트로 보낸다.
- 주문 서빙 완료
- 주문 배달 시작
  - 배달 시작 시 타입은 배달 타입이어야 한다.
  - 배달 시작 시 상태는 서빙완료 상태여야 한다.
  - 배달중 상태로 변경한다.
- 주문 배달 완료
  - 배달 완료 시 상태는 배달중이어야 한다.
  - 배달 완료 상태로 변경한다.
- 주문 완료
  - 배달 완료 상태인 경우에만 완료할 수 있다.

### 포장 (TAKEOUT)
- 주문 생성
   - 주문한 메뉴 수는 0개 이상이어야 한다.
- 주문 수락
- 주문 서빙 완료
- 주문 완료
  - 서빙완료 상태여야만 완료할 수 있다.

### 매장식자 (EAT_IN)
- 주문 생성
  - 주문 테이블이 사용중이 아닌 상태여야 한다.
- 주문 수락
- 주문 서빙 완료
- 주문 완료
  - 서빙완료 상태여야만 완료할 수 있다.
  - 완료 후 완료된 주문 테이블은 손님 수를 0으로, 사용중이 아닌 상태로 변경한다.


# 주문 라인 아이템 (주문한 메뉴)
##### 메뉴, 개수, 가격이 있다.

# 주문 테이블
##### 테이블 이름, 손님 수, 테이블 사용 여부
- 테이블 생성
  - 이름은 필수값이다.
  - 초기 손님 수는 0 이다.
  - 초기 사용 여부는 FALSE 이다.
- 테이블 앉기
  - 앉으면 사용 여부를 TRUE로 변경한다.
- 테이블 청소
  - 주문 상태가 완료가 아닌 경우에는 청소할 수 없다.
  - 청소를 하면 손님 수는 0, 사용중이 아닌 상태로 변경한다.
- 테이블 손님 수 변경
  - 손님 수는 0 보다 작을 수 없다.
  - 사용중인 경우에만 변경할 수 있다.
- 테이블 전체 조회

# 주문 상태
##### 대기(WATITING), 수락(ACCEPTED), 서빙완료(SERVED), 배달중(DELIVERING), 배달완료(DELIVERED), 주문완료(COMPLETED)
# 주문 타입
##### 배달(DELIVERY), 포장(TAKEOUT), 매장식사(EAT_IN)








# 주문 -> 주문 플로우로 변경
##### 주문에는 주문 타입, 주문 상태, 주문 날짜, 주문한 메뉴, 주문한 주소, 주문 테이블이 있다.
- 주문 생성
  - 주문 타입은 필수값이다.
  - 주문시 메뉴는 필수값이며 무조건 한 개 이상 있어야 한다.
  - 주문 타입이 매장식사가 아닌 경우 주문시 메뉴 수는 0개 이상이어야 한다.
  - 주문시 메뉴는 표출 상태여야 한다.
  - 주문시 메뉴 가격이 다른 경우 주문이 안된다.
  - 초기 주문 상태는 대기 상태이다.
  - 주문 타입이 배달인 경우 주소는 필수값이다.
  - 주문 타입이 매장식사인 경우 주문 테이블이 사용중이 아닌 상태여야 한다.
- 주문 수락
  - 수락 시 상태는 대기 상태여야만 한다.
  - 주문 타입이 배달인 경우 주문시 메뉴들의 가격 합과 주소를 클라이언트로 보낸다.
  - 수락 상태로 변경한다.
- 주문 서빙완료
  - 서빙완료 시 상태는 수락 상태여야만 한다.
  - 서빙완료 상태로 변경한다.
- 주문 배달 시작
  - 배달 시작 시 타입은 배달 타입이어야 한다.
  - 배달 시작 시 상태는 서빙완료 상태여야 한다.
  - 배달중 상태로 변경한다.
- 주문 배달 완료
  - 배달 완료 시 상태는 배달중이어야 한다.
  - 배달 완료 상태로 변경한다.
- 주문 완료
  - 타입이 배달인 경우 배달 완료 상태인 경우에만 완료할 수 있다.
  - 타입이 포장이거나 매장식사인 경우 서빙완료 상태여야만 완료할 수 있다.
  - 주문 완료 상태로 변경한다.
  - 주문 완료 후 타입이 매장식사인 경우 완료된 주문 테이블은 손님 수를 0으로, 사용중이 아닌 상태로 변경한다.
- 주문 전체 조회