package cms.SchedulePackage;

/**
 작성자: 정수연
 기능: 조교 정보
 */
public class Assistant extends Admin {
    
    public Assistant(){  // 조교 클래스 생성자. 조교가 할 행동 정의
//        searchState = new SearchAvailable();  // 실습실 좌석 조회 가능
//        registerSchedule = new Schedule();   // 시간표 입력
        setRegisterSchedule(new Schedule());
        //setSearchState(new SearchAvailable());
    }
    
    @Override
    public void display(){   
        System.out.println("조교입니다.");
    }
}
