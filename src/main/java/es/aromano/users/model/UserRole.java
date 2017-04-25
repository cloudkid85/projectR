package es.aromano.users.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class UserRole implements GrantedAuthority, Serializable {

    @Basic
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private UserRoleType role;

    public UserRole(){ }

    public UserRole(UserRoleType role){
        this.role = role;
    }
    
    public UserRole(String role){
    	this.role = UserRoleType.from(role);
    }

    @Override
    public String getAuthority() {
        return this.role.toString();
    }
    
    public UserRoleType getRole(){
    	return this.role;
    }

}
