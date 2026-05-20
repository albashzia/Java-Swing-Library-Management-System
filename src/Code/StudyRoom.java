package Code;

import java.io.Serializable;

public class StudyRoom implements Serializable {
    private String roomNo;
    private boolean isReserved;
    private Member reservedByMember;

    StudyRoom(){
        this.roomNo = null;
        this.isReserved = false;
        this.reservedByMember = null;
    }

    StudyRoom(String roomNo, Member reservedByMember){
        this.roomNo = roomNo;
        this.reservedByMember = reservedByMember;
    }
}
