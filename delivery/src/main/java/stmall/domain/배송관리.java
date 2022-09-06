package stmall.domain;

import stmall.domain.배송완료됨;
import stmall.domain.배달취소됨;
import stmall.domain.반품완료됨;
import stmall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="배송관리_table")
@Data

public class 배송관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        배송완료됨 배송완료됨 = new 배송완료됨(this);
        배송완료됨.publishAfterCommit();



        배달취소됨 배달취소됨 = new 배달취소됨(this);
        배달취소됨.publishAfterCommit();



        반품완료됨 반품완료됨 = new 반품완료됨(this);
        반품완료됨.publishAfterCommit();

    }

    public static 배송관리Repository repository(){
        배송관리Repository 배송관리Repository = DeliveryApplication.applicationContext.getBean(배송관리Repository.class);
        return 배송관리Repository;
    }




    public static void 배송시작(주문됨 주문됨){

        /** Example 1:  new item 
        배송관리 배송관리 = new 배송관리();
        repository().save(배송관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문됨.get???()).ifPresent(배송관리->{
            
            배송관리 // do something
            repository().save(배송관리);


         });
        */

        
    }
    public static void 배송취소(주문취소됨 주문취소됨){

        /** Example 1:  new item 
        배송관리 배송관리 = new 배송관리();
        repository().save(배송관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문취소됨.get???()).ifPresent(배송관리->{
            
            배송관리 // do something
            repository().save(배송관리);


         });
        */

        
    }


}
