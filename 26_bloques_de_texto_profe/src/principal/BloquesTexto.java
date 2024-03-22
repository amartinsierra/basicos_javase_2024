package principal;

public class BloquesTexto {

	public static void main(String[] args) {
		String tutorial="El lenguaje \"html\":\n Se emplea para formatear, las etiquetas tienen la forma <etiqueta>";
		String bloqueTutorial="""
				El lenguaje "html":
				Se emplea para formatear,\
				las etiquetas tienen la forma <etiqueta>""";
		System.out.println(bloqueTutorial);
		System.out.println(tutorial);

	}

}
