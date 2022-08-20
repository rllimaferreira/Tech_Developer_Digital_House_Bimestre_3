package test;

import dao.ConfiguracaoJDBC;
import dao.impl.HotelDaoH2;
import entities.Hotel;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import service.HotelService;

public class HotelTest {

    final static Logger LOGGER = Logger.getLogger(HotelTest.class);

    private HotelService hotelService = new HotelService(new HotelDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void guardarHotel() {

        LOGGER.info("Criando o 1º hotel em memória.");
        Hotel hotel1 = new Hotel("Java Gaúcho Hotel", "Rua do Churrascão Gaúcho", 10, "Pelotas", "RS", 5);
        Hotel hotel2 = new Hotel("Super Ranger Hotel", "Rua do Ranger Vermelho", 13, "São Paulo", "SP", 5);
        Hotel hotel3 = new Hotel("Santista Hotel", "Rua do Santista", 1000, "Santos", "SP", 5);
        Hotel hotel4 = new Hotel("Colorado Internacional Hotel", "Rua do Colorado", 15, "Pelotas", "RS", 5);
        Hotel hotel5 = new Hotel("Barril Gaúcho Hotel", "Rua do Chaves", 10, "Santana do Livramento", "RS", 5);

        LOGGER.info("Hotel em memória sem o ID.");
        System.out.println(hotel1);
        System.out.println(hotel2);
        System.out.println(hotel3);
        System.out.println(hotel4);
        System.out.println(hotel5);

        System.out.println("");

        LOGGER.info("Recebendo do BD o registro criado com ID.");
        Hotel retorno1 = hotelService.salvar(hotel1);
        Hotel retorno2 = hotelService.salvar(hotel2);
        Hotel retorno3 = hotelService.salvar(hotel3);
        Hotel retorno4 = hotelService.salvar(hotel4);
        Hotel retorno5 = hotelService.salvar(hotel5);

        LOGGER.info("Hotel recebido do H2 com ID.");
        System.out.println(retorno1);
        System.out.println(retorno2);
        System.out.println(retorno3);
        System.out.println(retorno4);
        System.out.println(retorno5);
    }
}
