package NoSQLFactory;

public class NoSQLFactory implements AbstracFactory<CursosRepository> {

	@Override
	public CursosRepository createRepositoryAlumnos(String type) {
		return null;
	}

	@Override
	public CursosRepository createRepositoryCursos(String type) {
		
		if("RELACIONAL".equals(type)) {
			return new CursoRelacionalRepository();
		}else if("NoSQL".equals(type)) {
			return new CursosNoSQLRepository();
		}
		return null;
	}

}
