package es.aromano.users.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import es.aromano.empresas.exceptions.EmpresaException;
import es.aromano.users.exceptions.UserException;
import es.aromano.users.model.User;


public interface UserService extends UserDetailsService{

    User findUsuarioEmpresaLogada(int idUsuario);

    User findUserById(int idUsuario);

	User findByEmail(String email);

    User findByUsername(String usermname);

    User createUser(User user) throws EmpresaException, UserException;

	List<User> findUsuariosEmpresaLogada();

	User createUserEmpresa(User user);

	User editUser(int idUsuario, User editedUser) throws UserException;

}
