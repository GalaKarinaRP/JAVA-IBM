package NoSQLFactory;

import java.util.ArrayList;
import java.util.List;

public class AlumnosRelacionalRepository implements AlumnosRepository {

	@Override
	public List<String> getListaAlumnos() {
		
		List<String> listaAlumnosRelacional = new ArrayList<>();
		
		listaAlumnosRelacional.add("Monserrat Campos");
		listaAlumnosRelacional.add("Rodolfo Morales");
		return listaAlumnosRelacional;
	}

}
