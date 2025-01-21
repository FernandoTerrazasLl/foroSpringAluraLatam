package Controller;


import Dtos.DatosDevolucionTopico;
import Dtos.DatosRegistroTopico;
import ModeloBaseDatos.Topicos;
import Repositorys.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @PostMapping
    public ResponseEntity<DatosDevolucionTopico> registrarMedico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
        Topicos topic = topicosRepository.save(new Topicos(datosRegistroTopico));
        DatosDevolucionTopico datosDevolucionTopico = new DatosDevolucionTopico(topic);
        return ResponseEntity.status(201).body(datosDevolucionTopico);
    }
}

