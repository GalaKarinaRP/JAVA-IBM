package NoSQLFactory;

import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {
		AbstracFactory abstractFactoryCurso = ProviderFactory.getFactory("CURSOSREPOSITORY");
		
		CursosRepository cursosRelacional = (CursosRepository) abstractFactoryCurso.createRepositoryCursos("RELACIONAL");
		System.out.println(String.format("Lista de cursos Relacional %s ", cursosRelacional.getListaCursos().stream().collect(Collectors.toList())));
		
		CursosRepository cursosSql = (CursosRepository) abstractFactoryCurso.createRepositoryCursos("NoSQL");		
		System.out.println(String.format("Lista de cursos No SQL %s ", cursosSql.getListaCursos().stream().collect(Collectors.toList())));
		
		AbstracFactory abstractFactoryAlumnos = ProviderFactory.getFactory("ALUMNOSREPOSITORY");
		
		AlumnosRepository alumnosRelacional = (AlumnosRepository) abstractFactoryAlumnos.createRepositoryAlumnos("RELACIONAL");
		System.out.println(String.format("Lista de alumnos Relacional %s ", alumnosRelacional.getListaAlumnos().stream().collect(Collectors.toList())));
		
		AlumnosRepository alumnosSql = (AlumnosRepository) abstractFactoryAlumnos.createRepositoryAlumnos("NoSQL");		
		System.out.println(String.format("Lista de alumnos NoSQL %s ", alumnosSql.getListaAlumnos().stream().collect(Collectors.toList())));
		
	}
}
