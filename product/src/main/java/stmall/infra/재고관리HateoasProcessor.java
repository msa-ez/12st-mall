package stmall.infra;
import stmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 재고관리HateoasProcessor implements RepresentationModelProcessor<EntityModel<재고관리>>  {

    @Override
    public EntityModel<재고관리> process(EntityModel<재고관리> model) {

        
        return model;
    }
    
}
