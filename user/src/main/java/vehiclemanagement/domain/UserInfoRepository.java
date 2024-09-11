package vehiclemanagement.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vehiclemanagement.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "userInfos", path = "userInfos")
public interface UserInfoRepository
    extends PagingAndSortingRepository<UserInfo, Long> {}
