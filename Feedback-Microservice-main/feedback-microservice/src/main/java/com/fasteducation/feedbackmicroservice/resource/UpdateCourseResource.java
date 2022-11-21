package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateCourseResource {
    
    @NotNull
    @NotBlank
    @Size(max = 50)
    private String D_name;
    
    @NotNull
    @NotBlank    
    private int N_hours;
    
    @NotNull
    @NotBlank    
    private int Teachers_Users_C_user_id;
    
    @NotNull
    @NotBlank    
    private int Routes_C_route_id;
}
