package mkaganm.springboottrial.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "ad soyad alanını boş geçemezsiniz")
    @Size(min=1,max=255)
    private String teacherNameSurname;

    @NotEmpty(message = "email alanını boş geçemezsiniz")
    @Email(message = "uygun formatta mail girmediniz")
    private String teacherEmail;

    @NotEmpty(message = "şifreyi boş geçemezsiniz")
//    @Min(value=10,message="minumum 10 karakter olmalıdır.")
//    @Max(value=18,message="maksimum 18 karakter olmalıdır.")
    @Size(min=10,max=18)
    private String teacherPassword;
}
