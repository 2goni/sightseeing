package org.mi5.sightseeing.config.auth.dto;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class LoginInfo {

    private boolean isFirstLogin;

    public boolean login(){
        return isFirstLogin;
    }
    public void loginSet(boolean check){
        this.isFirstLogin = check;
    }
}
