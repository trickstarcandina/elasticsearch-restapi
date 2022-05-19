package springboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.repository.SampleRepository;
import springboot.service.SampleService;

@Service
@AllArgsConstructor
@Transactional
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;
}
