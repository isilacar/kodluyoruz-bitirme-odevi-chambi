package org.kodluyoruz.group1.library.dto;

import lombok.Data;
import org.kodluyoruz.group1.library.model.enums.StatusEnum;
import java.util.ArrayList;
import java.util.List;

@Data
public class MemberDTO extends BaseDTO {

    private String firstName;

    private String lastName;

    private String userName;

    private String email;

    private String password;

    private String phoneNumber;

    private String adress;

    private StatusEnum memberStatus;

    private List<String> roles = new ArrayList<>();

}
