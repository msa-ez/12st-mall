package stmall.domain;

import stmall.domain.주문됨;
import stmall.domain.주문취소됨;
import stmall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문관리_table")
@Data

public class 주문관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();



        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();

    }

    public static 주문관리Repository repository(){
        주문관리Repository 주문관리Repository = OrderApplication.applicationContext.getBean(주문관리Repository.class);
        return 주문관리Repository;
    }






}
