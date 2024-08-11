package Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 @Autowired
 private CustomerRepository customerRepository;

 @Override
 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
  Customer customer = customerRepository.findByEmail(username);
  if (customer != null) {
   return new User(customer.getEmail(), customer.getPassword(), getAuthorities(customer.getRoles()));
  } else {
   throw new UsernameNotFoundException("User not found");
  }
 }

 private List<GrantedAuthority> getAuthorities(List<String> roles) {
  List<GrantedAuthority> authorities = new ArrayList<>();
  for (String role : roles) {
   authorities.add(new SimpleGrantedAuthority(role));
  }
  return authorities;
 }
}
