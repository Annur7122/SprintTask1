package BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.Controller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
}
