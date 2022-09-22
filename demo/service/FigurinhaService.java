package figurinhas.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import figurinhas.demo.models.Figurinha;
import figurinhas.demo.repository.FigurinhaRepository;

@Service
public class FigurinhaService {
	@Autowired
	
	private FigurinhaRepository figurinhaRepository;
	private ArrayList<Figurinha> figurinhaList = new ArrayList<>();
	
	public List<Figurinha> getFigurinhas() {
		return figurinhaRepository.findAll();
	}

	public Figurinha saveFigurinha(Figurinha fig) {
		return figurinhaRepository.save(fig);
	}

	// Retorna lista de figurinhas pelo Id
	public List<Figurinha> listFigurinha(long id) {
		List<Figurinha> selected = new ArrayList<>();
		for (Figurinha figurinha : figurinhaList) {
			if (figurinha.getIdDono().equals(id)) {
				selected.add(figurinha);
			}
		}
		return selected;
	}

	public List<Figurinha> getFigurinhasByUser(Long idUser) {
		List<Figurinha> figurinhas = figurinhaRepository.findAll();
		List<Figurinha> figurinhasPorUsuario = new ArrayList<>();
		for (int j = 0; figurinhas.size() > j; j++) {
			if (figurinhas.get(j).getIdDono() == idUser) {
				figurinhasPorUsuario.add(figurinhas.get(j));
			}

		}
		return figurinhasPorUsuario;
	}

}
