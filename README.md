# 영화 예매

## 구현 내용
* 영화를 선택하면 그 영화에 대한 목록을 띄운다.
    * 해당 번호를 입력받고 숫자에 해당하는 영화정보 띄우기
        * 예외 : 해당 영화 번호가 없을 경우 다시 입력받기

* 에약할 시간표를 선택한다. (1번째 상영이 1번)
        * 예외 : 상영 시간이 아닌 경우 다시 입력받기
* 예약할 인원을 입력한다
        * 예외 : 상영 가능한 사람의 수가 아닌 경우
* 예약을 종료하고 결제를 진행(1번), 추가 예약을 진행하면 2번
    * 추가 예약 진행
        * 예외 : 1번과 2번 모두 아닐 경우 다시 입력받기
    * 결제 진행하기
        * id에 해당하는 정보 출력
        * 선택한 시간 출력하기
        * 예약 인원 알아내기

* 1번을 선택하면 예약 내역을 띄운다.
    * 영화정보 시작시간, 인원

* 결제를 진행한다.
* 총 금액 알아내기
* 포인트 사용 없으면 0
    * 포인트 사용시 결제 금액에서 포인트를 깎는다.총 금액 알아내기
        * 예외 : 0보다 작을 경우
* 신용카드 1번, 현금 2번
    * 신용카드 0.95, 현금 0.98

ex) 8000원짜리 영화를 2명에서 구입시 -> 16,000원
    포인트 1000원 사용                -> 15,000원
    카드 할인                       -> 14,250원

## 구현하지 못한 내용

