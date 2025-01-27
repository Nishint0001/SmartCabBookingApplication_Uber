package com.nishintgoyal.project.uber.uberApplication.repositories;

import com.nishintgoyal.project.uber.uberApplication.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long>
{

}
