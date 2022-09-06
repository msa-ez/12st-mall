package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 재고증가됨 extends AbstractEvent {

    private Long id;

    public 재고증가됨(재고관리 aggregate){
        super(aggregate);
    }
    public 재고증가됨(){
        super();
    }
    // keep

}
