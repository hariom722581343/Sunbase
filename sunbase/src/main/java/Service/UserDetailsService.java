package Service;

public interface UserDetailsService {
 UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
