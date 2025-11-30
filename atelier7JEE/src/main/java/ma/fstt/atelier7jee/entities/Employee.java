package ma.fstt.atelier7jee.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "firstName is required")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "lastName is required")
    @Column(nullable = false)
    private String lastName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "email is required")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "salary is required")
    @Min(value = 0, message = "salary must be >= 0")
    private Double salary;
}
