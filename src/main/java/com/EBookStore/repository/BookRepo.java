package com.EBookStore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EBookStore.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

	public Optional<Book> findById(Long id);

	public List<Book> findAll();
	
	public List<Book> findByGenre(String genre);

	public void deleteById(Long id);
	
}
