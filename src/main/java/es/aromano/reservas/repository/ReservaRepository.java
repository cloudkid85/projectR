package es.aromano.reservas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.aromano.reservas.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{

	@Query("from Reserva r where r.user.id = ?#{principal.id}")
	List<Reserva> reservasUsuario();

}
