package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

}
