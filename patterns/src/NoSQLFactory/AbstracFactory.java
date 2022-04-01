package NoSQLFactory;

public interface AbstracFactory<T> {
	
	T createRepositoryAlumnos(String type);
	T createRepositoryCursos(String type);	
	
}
