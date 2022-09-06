package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 재고차감됨 extends AbstractEvent {

    private Long id;

    public 재고차감됨(재고관리 aggregate){
        super(aggregate);
    }
    public 재고차감됨(){
        super();
    }
    // keep

}
