/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.inmobiliaria.pau.iva.backendpauiva.Controladores;

import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Clientes;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Empleados;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Dominio.Inmueble;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.ClientesRepository;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Infraestructura.EmpleadosRepository;
import co.edu.inmobiliaria.pau.iva.backendpauiva.Servicios.InmuebleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/inmueble"})
public class InmuebleControlador {
    @Autowired
    InmuebleService service;
    @Autowired
    private EmpleadosRepository empleadosRepository;
    @Autowired
    private ClientesRepository clientesRepository;
    
    private static final String UPLOAD_DIR = "public/";
    
    @GetMapping("/submit")
    public List<Inmueble> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public ResponseEntity<?> agregar(@RequestParam("foto") MultipartFile foto,
                                     @RequestParam("inmueble") String inmuebleJson,
                                     @RequestParam("comercialId") int comercialId,
                                     @RequestParam("propietario") int propietarioId) {
        try {
            // Convertir el JSON del inmueble a un objeto Inmueble
            ObjectMapper objectMapper = new ObjectMapper();
            Inmueble inmueble = objectMapper.readValue(inmuebleJson, Inmueble.class);

            // Buscar el comercial (empleado) por su ID y asignarlo al inmueble
            Empleados empleado = empleadosRepository.findById(comercialId);
            if (empleado != null) {
                inmueble.setComercial(empleado);
            } else {
                return ResponseEntity.badRequest().body("Comercial no encontrado");
            }

            // Buscar el propietario por su ID y asignarlo al inmueble
            Clientes propietario = clientesRepository.findById(propietarioId);
            if (propietario != null) {
                inmueble.setPropietario(propietario);
            } else {
                return ResponseEntity.badRequest().body("Propietario no encontrado");
            }

            // Guardar la imagen en el servidor
            String fileName = UUID.randomUUID().toString() + "_" + foto.getOriginalFilename();
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.write(path, foto.getBytes());
            inmueble.setFoto(fileName);

            // Guardar el inmueble en la base de datos
            Inmueble nuevoInmueble = service.add(inmueble);

            return ResponseEntity.ok(nuevoInmueble);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar la imagen: " + e.getMessage());
        }
    }
    
    
    @GetMapping("/submit/{id}")
    public Inmueble listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Inmueble  editar(@RequestBody Inmueble p, @PathVariable("id") int id){
        p.setIdinmueble(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/submit/{id}") 
    public Inmueble delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
