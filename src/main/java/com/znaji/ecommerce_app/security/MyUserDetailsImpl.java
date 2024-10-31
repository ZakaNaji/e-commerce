package com.znaji.ecommerce_app.security;

import com.znaji.ecommerce_app.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class MyUserDetailsImpl implements UserDetails {

    private Long id;
    private String username;
    private String email;
    private String password;
    private List<GrantedAuthority> authorities;

    public MyUserDetailsImpl(Long id, String username, String email, String password, List<GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserDetails build(User user) {
        List<GrantedAuthority> roles = user.getRoles()
                .stream()
                .filter(role -> role.getRoleName() != null)
                .map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
                .collect(Collectors.toList());
        return new MyUserDetailsImpl(user.getUserId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                roles);
    }

                                          @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyUserDetailsImpl that = (MyUserDetailsImpl) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
