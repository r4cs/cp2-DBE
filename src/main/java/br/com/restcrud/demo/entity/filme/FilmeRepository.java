package br.com.restcrud.demo.entity.filme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Page<Filme> findAllByAtivoTrue(Pageable paginacao);
}
