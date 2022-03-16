package team.bahor.entity.exam;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(indexes = @Index(name = "exam_id_eqg_index", columnList = "exam_id"))
public class ExamQuestionGeneration {
    @Id
    @Column(unique = true)
    private String id;

    @Column(name = "exam_id", nullable = false)
    private String examId;

    @Column(nullable = false)
    private Short count;

    @Column(nullable = false)
    private Short mark;
}
