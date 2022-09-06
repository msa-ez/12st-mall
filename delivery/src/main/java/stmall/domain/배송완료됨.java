package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배송완료됨 extends AbstractEvent {

    private Long id;

    public 배송완료됨(배송관리 aggregate){
        super(aggregate);
    }
    public 배송완료됨(){
        super();
    }
    // keep

}
