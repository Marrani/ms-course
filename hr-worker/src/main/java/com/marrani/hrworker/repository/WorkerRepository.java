package com.marrani.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marrani.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
