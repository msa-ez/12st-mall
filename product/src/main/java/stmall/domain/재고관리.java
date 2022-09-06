package stmall.domain;

import stmall.domain.재고차감됨;
import stmall.domain.재고증가됨;
import stmall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="재고관리_table")
@Data

public class 재고관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        재고차감됨 재고차감됨 = new 재고차감됨(this);
        재고차감됨.publishAfterCommit();



        재고증가됨 재고증가됨 = new 재고증가됨(this);
        재고증가됨.publishAfterCommit();

    }

    public static 재고관리Repository repository(){
        재고관리Repository 재고관리Repository = ProductApplication.applicationContext.getBean(재고관리Repository.class);
        return 재고관리Repository;
    }




    public static void 재고차감(배송완료됨 배송완료됨){

        /** Example 1:  new item 
        재고관리 재고관리 = new 재고관리();
        repository().save(재고관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(배송완료됨.get???()).ifPresent(재고관리->{
            
            재고관리 // do something
            repository().save(재고관리);


         });
        */

        
    }
    public static void 재고증가(반품완료됨 반품완료됨){

        /** Example 1:  new item 
        재고관리 재고관리 = new 재고관리();
        repository().save(재고관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(반품완료됨.get???()).ifPresent(재고관리->{
            
            재고관리 // do something
            repository().save(재고관리);


         });
        */

        
    }


}
