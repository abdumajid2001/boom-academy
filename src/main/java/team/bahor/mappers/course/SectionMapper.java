package team.bahor.mappers.course;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;
import team.bahor.dto.section.SectionCreateDto;
import team.bahor.dto.section.SectionDto;
import team.bahor.dto.section.SectionPositionUpdateDto;
import team.bahor.dto.section.SectionUpdateDto;
import team.bahor.entity.courses.Section;
import team.bahor.mappers.base.AbstractMapper;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface SectionMapper extends AbstractMapper<Section, SectionDto, SectionCreateDto, SectionUpdateDto> {
    @Override
    SectionDto toDto(Section entity);

    @Override
    List<SectionDto> toDto(List<Section> entities);

    @Override
    Section fromCreateDto(SectionCreateDto createDto);

    @Override
    Section fromUpdateDto(SectionUpdateDto updateDto);

    Section fromUpdateDto(SectionUpdateDto sectionUpdateDto, @MappingTarget Section section);

    Section fromUpdateDto(SectionPositionUpdateDto sectionPositionUpdateDto, @MappingTarget Section section);
}
