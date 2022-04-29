package com.rtw.Project2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rtw.Project2.Model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	//Create mapping to this custom query  
/*	@Query("select e from Client e where e.name like %:name%")//the from location is a class a not table
    List<Client> findClientByName(@Param("client_name") String cliName);*/
	

}
