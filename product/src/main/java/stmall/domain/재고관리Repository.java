package stmall.domain;

import stmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="재고관리", path="재고관리")
public interface 재고관리Repository extends PagingAndSortingRepository<재고관리, Long>{

}
