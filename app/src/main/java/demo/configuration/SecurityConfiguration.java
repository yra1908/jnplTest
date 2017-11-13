package demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring().antMatchers("/ping", "/lib/**");
    }

    @Override
    public void configure (HttpSecurity http) throws Exception {

       /* http.addFilterBefore(new DemoApplication.Fi(), BasicAuthenticationFilter.class);*/

        http
                .authorizeRequests()

                .antMatchers("/notsecure").permitAll()
                .antMatchers("/endpoint/*").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll();

    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("root").roles("USER");
    }

}
