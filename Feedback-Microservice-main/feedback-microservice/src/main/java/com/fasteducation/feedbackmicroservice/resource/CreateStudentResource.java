package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class CreateStudentsResource {
    
    @NotNull
    @NotBlank    
    @Size(max = 50)
    private String D_password;
    
    @NotNull
    @NotBlank    
    @Size(max = 50)    
    private String B_student_type;

}
