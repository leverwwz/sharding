package com.example.shardingtable.dao;


import com.example.shardingtable.entity.TUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TUser, Long> {
    TUser findByCertNo(String cerNo);

    @Query(value = "select * from tb_user where id=?1",nativeQuery = true)
    Page<TUser> find(Long aLong, Pageable pageable);
}