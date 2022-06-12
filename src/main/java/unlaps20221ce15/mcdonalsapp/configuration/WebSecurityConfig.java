package unlaps20221ce15.mcdonalsapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/products/*", "/categories/*", "/agregarProducto/*", "/actualizarProducto/*", "/borrarProducto/*", "/agregarCategoria/*", "/actualizarCategoria/*", "/borrarCategoria/*")
				.permitAll();
		http.csrf().disable();
	}
}
