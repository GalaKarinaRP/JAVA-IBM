package NoSQLFactory;

import abstractFactory.Credit;
import abstractFactory.Debit;

public class RelacionalFactory implements AbstracFactory<AlumnosRepository> {

	@Override
	public AlumnosRepository createRepositoryAlumnos(String type) {
		if("RELACIONAL".equals(type)) {
			return new AlumnosRelacionalRepository();
		}else if("NoSQL".equals(type)) {
			return new AlumnosNoSQLRepository();
		}
		return null;
		
	}

	@Override
	public AlumnosRepository createRepositoryCursos(String type) {
	
		return null;
		
	}

 
	
}
