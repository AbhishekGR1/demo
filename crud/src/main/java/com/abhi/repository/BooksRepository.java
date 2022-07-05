package com.abhi.repository;
import org.springframework.data.jpa.repository.JpaRepository;


//import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

import com.abhi.model.Books;  
//repository that extends CrudRepository 
@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>  
{  
}  