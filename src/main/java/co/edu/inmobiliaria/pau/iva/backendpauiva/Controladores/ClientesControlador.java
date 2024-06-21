package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/clientes" })
public class ClientesControlador {
    @Autowired
    ClientesService service;

}
