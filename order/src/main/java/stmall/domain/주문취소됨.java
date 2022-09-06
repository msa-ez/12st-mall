package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문취소됨 extends AbstractEvent {

    private Long id;

    public 주문취소됨(주문관리 aggregate){
        super(aggregate);
    }
    public 주문취소됨(){
        super();
    }
    // keep

}
