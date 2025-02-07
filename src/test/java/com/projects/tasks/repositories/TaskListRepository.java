package com.projects.tasks.repositories;

import com.projects.tasks.domain.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, UUID> {


}
