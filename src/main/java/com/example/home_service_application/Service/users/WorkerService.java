package com.example.home_service_application.Service.users;

import com.example.home_service_application.dto.user.WorkerInDto;
import com.example.home_service_application.entity.users.Worker;
import com.example.home_service_application.repository.users.WorkerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepo workerRepo;

    @Transactional
    public Worker saveWithDto(WorkerInDto workerInDto) {
        Worker worker = workerInDto.convertInDtoToEntity(workerInDto);
        return workerRepo.save(worker);
    }

    @Transactional
    public void delete(Long id) {
        workerRepo.delete(findById(id));
    }

    @Transactional
    public Worker findById(Long id) {
        return workerRepo.findById(id).get();
    }

    @Transactional
    public void updateAll(WorkerInDto workerInDto,Long id) {
        workerRepo.updateALLInformation(workerInDto.getFirstName(), workerInDto.getLastName(),
                workerInDto.getUsername(), workerInDto.getPassword(), workerInDto.getAddress(),
                workerInDto.getEmail(), id);
    }
}
