package NoSQLFactory;

import java.util.ArrayList;
import java.util.List;

public class AlumnosNoSQLRepository implements AlumnosRepository {

	@Override
	public List<String> getListaAlumnos() {
		
		List<String> listaAlumnosNoSQL = new ArrayList<>();
		
		listaAlumnosNoSQL.add("Gala Reyes");
		listaAlumnosNoSQL.add("Josue Reyes");
		
		return listaAlumnosNoSQL;
	}

}
