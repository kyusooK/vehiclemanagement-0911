package vehiclemanagement.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vehiclemanagement.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "vehicleInfos",
    path = "vehicleInfos"
)
public interface VehicleInfoRepository
    extends PagingAndSortingRepository<VehicleInfo, Long> {}
