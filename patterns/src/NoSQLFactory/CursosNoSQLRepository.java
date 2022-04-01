package NoSQLFactory;

import java.util.ArrayList;
import java.util.List;

public class CursosNoSQLRepository implements CursosRepository{

	@Override
	public List<String> getListaCursos() {
		
			List<String> cursoNoSQL = new ArrayList<>();
			
			cursoNoSQL.add("Node Js");
			cursoNoSQL.add("MongoDB");
		return cursoNoSQL;
	}

}
