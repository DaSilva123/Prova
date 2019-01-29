package prova_Q09;

import java.util.ArrayList;
import java.util.List;
import jdk.internal.dynalink.beans.StaticClass;

public class Banco {

	private static List<Medicamento> listaDeMedicamento = new ArrayList<>();

	public void adiciona(Medicamento e1) {

		listaDeMedicamento.add(e1);

	}

	public List<Medicamento> getMedicamentos() {
		return Banco.listaDeMedicamento;
	}

}
