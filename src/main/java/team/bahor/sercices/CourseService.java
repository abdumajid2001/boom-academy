package team.bahor.sercices;

import org.springframework.stereotype.Service;
import team.bahor.dto.course.CourseCreateDto;
import team.bahor.dto.course.CourseDto;
import team.bahor.dto.course.CourseUpdateDto;
import team.bahor.mappers.course.CourseMapper;
import team.bahor.repositories.CourseRepository;
import team.bahor.sercices.base.AbstractService;
import team.bahor.sercices.base.GenericCrudService;
import team.bahor.validators.CourseValidator;

import java.util.List;

@Service
public class CourseService extends AbstractService<
        CourseRepository,
        CourseMapper,
        CourseValidator>
        implements GenericCrudService<
        CourseDto,
        CourseCreateDto,
        CourseUpdateDto,
        String> {

    protected CourseService(CourseMapper mapper, CourseValidator validator, CourseRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public String create(CourseCreateDto createDto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(CourseUpdateDto updateDto) {

    }

    @Override
    public CourseDto get(String id) {
        return null;
    }

    @Override
    public List<CourseDto> getAll() {
        return null;
    }
}
