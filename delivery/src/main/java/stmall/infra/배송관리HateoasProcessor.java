package stmall.infra;
import stmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 배송관리HateoasProcessor implements RepresentationModelProcessor<EntityModel<배송관리>>  {

    @Override
    public EntityModel<배송관리> process(EntityModel<배송관리> model) {

        
        return model;
    }
    
}
