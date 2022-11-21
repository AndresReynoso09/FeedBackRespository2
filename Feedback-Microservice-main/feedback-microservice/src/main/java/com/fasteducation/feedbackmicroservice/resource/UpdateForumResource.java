package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateForumResource {

    @NotNull
    @NotBlank    
    private int D_description;
    
    @NotNull
    @NotBlank    
    private int F_date;
    
    @NotNull
    @NotBlank    
    private int Student_Users_C_user_id;
}
