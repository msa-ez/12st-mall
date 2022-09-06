package stmall.domain;

import stmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="배송관리", path="배송관리")
public interface 배송관리Repository extends PagingAndSortingRepository<배송관리, Long>{

}
