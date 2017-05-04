package es.aromano.reservas.service;

import java.util.List;
import es.aromano.reservas.model.Reserva;
import es.aromano.reservas.web.ReservaDTO;

public interface ReservaService {

	List<Reserva> reservasUsuario();

    List<Reserva> findReservasByIdEspacio(int idEspacio);
}
