package com.htm.room.DAO;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.htm.room.Entity.Room_Master;

public interface RoomDAO extends JpaRepository<Room_Master, String> {
	@Query("select r.availability from Slot r where r.date=:requiredDate")
	public List<String> showAvailibity(@Param("requiredDate") Date requiredDate);

}
