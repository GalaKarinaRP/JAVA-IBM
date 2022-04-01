package NoSQLFactory;

import java.util.ArrayList;
import java.util.List;

public class CursoRelacionalRepository implements CursosRepository {

	@Override
	public List<String> getListaCursos() {
		List<String> cursoRelacional = new ArrayList<>();
		
		cursoRelacional.add("SQL Server");
		cursoRelacional.add("MySQL");
		return cursoRelacional;
	}

}
