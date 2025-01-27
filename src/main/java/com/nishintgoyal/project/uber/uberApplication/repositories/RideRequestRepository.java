package com.nishintgoyal.project.uber.uberApplication.repositories;

import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long>
{

}
